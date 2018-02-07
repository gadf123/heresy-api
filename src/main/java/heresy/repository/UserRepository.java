package heresy.repository;

import heresy.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * @user updown
 * @date 2018. 1. 20.
 **/

public interface UserRepository extends JpaRepository<User, Long> {
}
