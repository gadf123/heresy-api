package heresy.controller.user;

import heresy.domain.user.User;
import heresy.domain.user.UserHomeTown;
import heresy.firebase.PostAuthAnno;
import heresy.repository.UserHomeTownRepository;
import heresy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * @user updown
 * @date 2018. 1. 17.
 **/

@CrossOrigin(origins = "*")
@RestController
public class UserController {

    private static final Logger logger = Logger.getLogger(UserController.class.getName());

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserHomeTownRepository userHomeTownRepository;


    @RequestMapping(value = "/selectUsers", method = RequestMethod.GET)
//    @PostAuthAnno
//    public List<User> user() {
    public HashMap<String, Object> user() {
        HashMap<String, Object> map = new HashMap<>();
        logger.info("■■■■■■■■■■UserController.selectUsers Start■■■■■■■■■■");
        List<User> userList = userRepository.findAll();
        List<UserHomeTown> userHomeTownList = userHomeTownRepository.findAll();
        map.put("userList", userList);
        map.put("userHomeTownList", userHomeTownList);
        logger.info("■■■■■■■■■■UserController.selectUsers End■■■■■■■■■■■■");
        return map;
    }

    @RequestMapping(value = "/selecOneUsers", method = RequestMethod.POST)
//    public List<User> user() {
    public HashMap<String, Object> userOne(@RequestBody User userParam) {
        HashMap<String, Object> map = new HashMap<>();
        logger.info("■■■■■■■■■■UserController.selectUsers Start■■■■■■■■■■");
        String userId = userParam.getUserId();
        User user = userRepository.findByUserId(userId);
//        UserHomeTown userHomeTown = userHomeTownRepository.findOne(userId);
        map.put("user", user);
//        map.put("userHomeTownList", userHomeTown);
        logger.info("■■■■■■■■■■UserController.selectUsers End■■■■■■■■■■■■");
        return map;
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
        int userIdx = user.getIdx();
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
        int userIdx = user.getIdx();
        userRepository.delete(userIdx);

        List<User> userList = userRepository.findAll();
        logger.info("■■■■■■■■■■UserController.deleteUser End■■■■■■■■■■■■");
        return userList;
    }
}
