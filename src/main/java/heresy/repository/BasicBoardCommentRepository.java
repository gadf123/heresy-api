package heresy.repository;

import heresy.domain.board.BasicBoardArticle;
import heresy.domain.board.BasicBoardComment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @user updown
 * @date 2018. 2. 27.
 **/


    public interface BasicBoardCommentRepository extends JpaRepository<BasicBoardComment, Integer> {
}
