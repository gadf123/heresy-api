package heresy.repository;

import heresy.domain.board.AgendaAndDebateBoardArticle;
import heresy.domain.board.AgendaAndDebateComment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @user updown
 * @date 2018. 3. 4.
 **/


public interface AgendaAndDebateCommentRepository extends JpaRepository<AgendaAndDebateComment, Integer> {
}
