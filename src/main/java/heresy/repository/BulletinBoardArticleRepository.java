package heresy.repository;

import heresy.domain.BulletinBoardArticle.BulletinBoardArticle;
import heresy.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @user updown
 * @date 2018. 2. 12.
 **/


public interface BulletinBoardArticleRepository extends JpaRepository<BulletinBoardArticle, Long> {
}
