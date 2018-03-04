package BulletinBoardArticleServiceTest;

import heresy.repository.BasicBoardArticleRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @user updown
 * @date 2018. 1. 22.
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
@SpringBootConfiguration
@ContextConfiguration
public class BulletinBoardArticleServiceTest {

    @Autowired
    private BasicBoardArticleRepository basicBoardArticleRepository;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void test1() throws Exception {
        System.out.println(basicBoardArticleRepository.findAll());
    }
}
