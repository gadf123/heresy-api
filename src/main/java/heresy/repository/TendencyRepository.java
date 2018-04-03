package heresy.repository;

import heresy.domain.board.BasicBoardComment;
import heresy.domain.board.Tendency;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @user updown
 * @date 2018. 3. 23.
 **/


public interface TendencyRepository extends JpaRepository<Tendency, Integer> {
}
