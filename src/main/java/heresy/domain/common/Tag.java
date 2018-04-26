package heresy.domain.common;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @user updown
 * @date 2018. 4. 10.
 **/

@Entity
public class Tag {

    @Id
    @GeneratedValue
    private int tagIdx;

    private String tag;

    public int getTagIdx() {
        return tagIdx;
    }

    public void setTagIdx(int tagIdx) {
        this.tagIdx = tagIdx;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
