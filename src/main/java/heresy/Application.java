package heresy;

import heresy.domain.BulletinBoardArticle.BulletinBoardArticle;
import heresy.domain.user.User;
import heresy.repository.BulletinBoardArticleRepository;
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

    @Autowired
    BulletinBoardArticleRepository bulletinBoardArticleRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        userRepository.save(new User(Long.valueOf(0), "userNickName0"));
        userRepository.save(new User(Long.valueOf(1), "userNickName1"));
        userRepository.save(new User(Long.valueOf(2), "userNickName2"));
        userRepository.save(new User(Long.valueOf(3), "userNickName3"));
        userRepository.save(new User(Long.valueOf(4), "userNickName4"));
        userRepository.save(new User(Long.valueOf(5), "userNickName5"));

        Iterable<User> list1 = userRepository.findAll();

        System.out.println("userRepository.findAll() Method.");
        for( User m : list1){
            System.out.println(m.toString());
        }

        bulletinBoardArticleRepository.save(new BulletinBoardArticle(Long.valueOf(0),"subject0","userNickName0","P"));
        bulletinBoardArticleRepository.save(new BulletinBoardArticle(Long.valueOf(1),"subject1","userNickName1","P"));
        bulletinBoardArticleRepository.save(new BulletinBoardArticle(Long.valueOf(2),"subject2","userNickName2","P"));
        bulletinBoardArticleRepository.save(new BulletinBoardArticle(Long.valueOf(3),"subject3","userNickName3","P"));
        bulletinBoardArticleRepository.save(new BulletinBoardArticle(Long.valueOf(4),"subject4","userNickName4","P"));
        bulletinBoardArticleRepository.save(new BulletinBoardArticle(Long.valueOf(5),"subject5","userNickName5","P"));
        bulletinBoardArticleRepository.save(new BulletinBoardArticle(Long.valueOf(6),"subject6","userNickName6","N"));
        bulletinBoardArticleRepository.save(new BulletinBoardArticle(Long.valueOf(7),"subject7","userNickName7","N"));
        bulletinBoardArticleRepository.save(new BulletinBoardArticle(Long.valueOf(8),"subject8","userNickName8","N"));
        bulletinBoardArticleRepository.save(new BulletinBoardArticle(Long.valueOf(9),"subject9","userNickName9","N"));
        bulletinBoardArticleRepository.save(new BulletinBoardArticle(Long.valueOf(10),"subject10","userNickName10","N"));

        Iterable<BulletinBoardArticle> list2 = bulletinBoardArticleRepository.findAll();

        System.out.println("bulletinBoardArticleRepository.findAll() Method.");
        for( BulletinBoardArticle m : list2){
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
