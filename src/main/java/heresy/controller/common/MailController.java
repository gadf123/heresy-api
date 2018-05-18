package heresy.controller.common;

import heresy.domain.user.User;
import heresy.domain.user.UserHomeTown;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//import sun.jvm.hotspot.debugger.AddressException;

//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

/**
 * @user updown
 * @date 2018. 4. 18.
 **/
@CrossOrigin(origins = "*")
@RestController
public class MailController {
//
//    @RequestMapping(value = "/mailSender", method = RequestMethod.POST)
//    public void mailSender(HttpServletRequest request, ModelMap mo) throws AddressException, MessagingException {
//
////    @RequestMapping(value = "/mailSender")
////    public void mailSender(HttpServletRequest request, ModelMap mo)
////     throws AddressException, MessagingException 
//
//        //    {
//        String host = "smtp.mailtrap.io";
//        String username = "3016c4236c1a2c";
//
//        // 네이버일 경우 smtp.naver.com 을 입력합니다. 
//        // Google일 경우 smtp.gmail.com 을 입력합니다. 
//        // 네이버 아이디를 입력해주세요. @nave.com은 입력하지 마시구요. 
//        String password = "38920e18ad929e"; // 네이버 이메일 비밀번호를 입력해주세요. 
//        int port = 2525; // 포트번호 
//        String recipient = "gadf123@naver.com"; // 받는 사람의 메일주소를 입력해주세요. 
//        // 메일 내용 
//        String subject = "메일테스트"; // 메일 제목 입력해주세요. 
//        String body = username + "님으로 부터 메일을 받았습니다."; // 메일 내용 입력해주세요. 
//        Properties props = System.getProperties();
//        // 정보를 담기 위한 객체 생성 
//        // SMTP 서버 정보 설정 
//        props.put("mail.smtp.host", host);
//        props.put("mail.smtp.port", port);
//        props.put("mail.smtp.user", username);
//        props.put("mail.smtp.pass", password);
//        props.put("mail.smtp.auth", "true"); //enable authentication
//        props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS
////        props.put("mail.smtp.ssl.enable", "true");
//
////        props.put("mail.smtp.ssl.enable", "true");
////        props.put("mail.smtp.ssl.trust", host);
//        // Session 생성 
//        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
//            String un = username;
//            String pw = password;
//
//            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
//                return new javax.mail.PasswordAuthentication(un, pw);
//            }
//        });
//        session.setDebug(true); //for debug 
//
//        Message mimeMessage = new MimeMessage(session);
////      MimeMessage 생성 
//        mimeMessage.setFrom(new InternetAddress("gadf123@gmail.com")); //발신자 셋팅 , 보내는 사람의 이메일주소를 한번 더 입력합니다. 이때는 이메일 풀 주소를 다 작성해주세요. 
//        mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
//
//        //수신자셋팅
//        // .TO 외에 .CC(참조) .BCC(숨은참조) 도 있음 
//        mimeMessage.setSubject(subject);
//
//        //제목셋팅 
//        mimeMessage.setText(body);//내용셋팅 
//        Transport.send(mimeMessage); // javax.mail.Transport.send() 이용 
//    }
}