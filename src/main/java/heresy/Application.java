package heresy;

import heresy.domain.board.BasicBoardArticle;
import heresy.domain.user.User;
import heresy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan
public class Application extends SpringBootServletInitializer{

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

}
