package heresy.controller.user;

import heresy.domain.user.User;
import heresy.repository.UserRepository;
import heresy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @user updown
 * @date 2018. 1. 17.
 **/

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/selectUsers")
    public List<User> user() {
        List<User> userList = userRepository.findAll();
        return userList;
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/createUser", method = RequestMethod.POST)
    public List<User> createUser(@RequestParam Map<String, String> parameters) {
        System.out.println(parameters);
        User user = new User();
        user.setUserId(parameters.get("userId"));
        user.setUserNickName(parameters.get("userNickName"));
        userRepository.save(user);

        List<User> userList = userRepository.findAll();
        return userList;
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public List<User> updateUser(@RequestParam Map<String, String> parameters) {
        System.out.println(parameters);
        Long userIdx = Long.parseLong(parameters.get("userIdx"));
        User findOneUser = userRepository.findOne(userIdx);
        findOneUser.setUserId(parameters.get("userId"));
        findOneUser.setUserNickName(parameters.get("userNickName"));
        userRepository.save(findOneUser);

        List<User> userList = userRepository.findAll();
        return userList;
    }

    @RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
    public List<User> deleteUser(@RequestParam Map<String, String> parameters) {
        Long userIdx = Long.parseLong(parameters.get("userIdx"));
        System.out.println(userIdx);
        userRepository.delete(userIdx);

        List<User> userList = userRepository.findAll();
        return userList;
    }
}
