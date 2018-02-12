package heresy.controller.user;

import heresy.domain.user.User;
import heresy.repository.UserRepository;
import heresy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * @user updown
 * @date 2018. 1. 17.
 **/

@RestController
public class UserController {

    private static final Logger logger = Logger.getLogger(UserController.class.getName());

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/selectUsers", method = RequestMethod.GET)
    public List<User> user() {
        logger.info("■■■■■■■■■■UserController.selectUsers Start■■■■■■■■■■");
        List<User> userList = userRepository.findAll();
        logger.info("■■■■■■■■■■UserController.selectUsers End■■■■■■■■■■■■");
        return userList;
    }

    @RequestMapping(value = "/createUser", method = RequestMethod.POST)
    public List<User> createUser(@RequestBody User user) {
        logger.info("■■■■■■■■■■UserController.createUser Start■■■■■■■■■■");
        System.out.println(user);
        userRepository.save(user);
        List<User> userList = userRepository.findAll();
        logger.info("■■■■■■■■■■UserController.createUser End■■■■■■■■■■■■");
        return userList;
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public List<User> updateUser(@RequestBody User user) {
        logger.info("■■■■■■■■■■UserController.updateUser Start■■■■■■■■■■");
        System.out.println(user);
        Long userIdx = user.getUserIdx();
        User findOneUser = userRepository.findOne(userIdx);
        findOneUser.setUserId(user.getUserId());
        findOneUser.setUserNickName(user.getUserNickName());
        userRepository.save(findOneUser);

        List<User> userList = userRepository.findAll();
        logger.info("■■■■■■■■■■UserController.updateUser End■■■■■■■■■■■■");
        return userList;
    }

    @RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
    public List<User> deleteUser(@RequestBody User user) {
        logger.info("■■■■■■■■■■UserController.deleteUser Start■■■■■■■■■■");
        System.out.println(user);
        Long userIdx = user.getUserIdx();
        userRepository.delete(userIdx);

        List<User> userList = userRepository.findAll();
        logger.info("■■■■■■■■■■UserController.deleteUser End■■■■■■■■■■■■");
        return userList;
    }
}
