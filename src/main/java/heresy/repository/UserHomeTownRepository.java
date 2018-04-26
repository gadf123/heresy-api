package heresy.repository;

import heresy.domain.user.User;
import heresy.domain.user.UserHomeTown;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @user updown
 * @date 2018. 1. 20.
 **/

public interface UserHomeTownRepository extends JpaRepository<UserHomeTown, Integer> {
}
