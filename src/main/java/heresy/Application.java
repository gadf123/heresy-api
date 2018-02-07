package heresy;

import heresy.domain.user.User;
import heresy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        userRepository.save(new User(Long.valueOf(0), "userNickName0"));
        userRepository.save(new User(Long.valueOf(1), "userNickName1"));
        userRepository.save(new User(Long.valueOf(2), "userNickName2"));
        userRepository.save(new User(Long.valueOf(3), "userNickName3"));

        Iterable<User> list1 = userRepository.findAll();

        System.out.println("findAll() Method.");
        for( User m : list1){
            System.out.println(m.toString());
        }
//
//        System.out.println("findByNameAndAgeLessThan() Method.");
//        List<User> list2 = userRepository.findByNameAndAgeLessThan("a", 10);
//        for( User m : list2){
//            System.out.println(m.toString());
//        }
//
//        System.out.println("findByNameAndAgeLessThanSQL() Method.");
//        List<Member> list3 = userRepository.findByNameAndAgeLessThanSQL("a", 10);
//        for( Member m : list3){
//            System.out.println(m.toString());
//        }
//
//        System.out.println("findByNameAndAgeLessThanSQL() Method.");
//        List<Member> list4 = userRepository.findByNameAndAgeLessThanOrderByAgeDesc("a", 15);
//        for( Member m : list4){
//            System.out.println(m.toString());
//        }

    }
}
