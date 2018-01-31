package user;

import heresy.Application;
import heresy.repository.UserRepository;
import heresy.service.UserService;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @user updown
 * @date 2018. 1. 22.
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
@SpringBootConfiguration
@ContextConfiguration
public class UserServiceTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test1() throws Exception {
        System.out.println(userRepository.findAll());
    }
}
