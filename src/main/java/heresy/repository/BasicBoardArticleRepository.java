package heresy.repository;

import heresy.domain.board.BasicBoardArticle;
import heresy.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @user updown
 * @date 2018. 2. 12.
 **/


public interface BasicBoardArticleRepository extends JpaRepository<BasicBoardArticle, Integer> {
}
