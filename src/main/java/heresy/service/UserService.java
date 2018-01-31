package heresy.service;

import heresy.domain.user.User;
import heresy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @user updown
 * @date 2018. 1. 17.
 **/

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User selectUsers(Long userIdx) {
        UserRepository userRepository = this.userRepository;
        Long index = Long.valueOf(1);
        User one = userRepository.getOne(index);
        return one;
    }
}
