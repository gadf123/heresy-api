package heresy.firebase;


import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseToken;
import heresy.firebase.TokenInvalidException;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.ExecutionException;

@Aspect
@Component("TokenCheckAspect")
public class PostAuth {

    @Pointcut("within(@org.springframework.stereotype.Controller *))")
    public void controllerPointCut(){
        System.out.println("test");
    }

    @Before("@annotation(PostAuthAnno)")
    public void toCheckToken() throws Throwable{
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        String idToken = request.getParameter("idToken");
        try {
            FirebaseToken decodedToken = FirebaseAuth.getInstance().verifyIdTokenAsync(idToken).get();
            String uid = decodedToken.getUid();
            System.out.println("---------------------");
            System.out.println(uid);
            System.out.println(decodedToken.getEmail());
        } catch (InterruptedException | ExecutionException e) {
            //e.printStackTrace();
            System.out.println("error");
            throw new TokenInvalidException("token", "user not found");
        }
        System.out.println("---------------------");
    }
}
