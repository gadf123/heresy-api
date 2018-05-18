package heresy.config;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import java.io.FileInputStream;
import java.io.IOException;

@Configuration
public class FirebaseConfig {

    @Bean
    public FirebaseApp FirebaseConfig() {
        String path = "";
        FirebaseApp firebaseApp = null;
        try {
            //path = new ClassPathResource("heresy-e0676-firebase-adminsdk-nkeml-e6a8ad80b1.json").getURL().getPath();
            path = new ClassPathResource("three-caliber-firebase-adminsdk-9ch69-e225878420.json").getURL().getPath();

            System.out.println(path);
            FileInputStream serviceAccount = new FileInputStream(path);

            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl("https://three-caliber.firebaseio.com/")
                    .build();

            firebaseApp = FirebaseApp.initializeApp(options);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return firebaseApp;
    }
}
