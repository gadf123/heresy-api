package heresy.domain.common;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @user updown
 * @date 2018. 4. 10.
 **/

@Entity
public class TagArticle {

    @Id
    @GeneratedValue
    private int tagIdx;

    private int articleIdx;

    public int getTagIdx() {
        return tagIdx;
    }

    public void setTagIdx(int tagIdx) {
        this.tagIdx = tagIdx;
    }

    public int getArticleIdx() {
        return articleIdx;
    }

    public void setArticleIdx(int articleIdx) {
        this.articleIdx = articleIdx;
    }
}
