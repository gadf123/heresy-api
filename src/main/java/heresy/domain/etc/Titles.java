package heresy.domain.etc;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Titles {

    public Titles(int titleIdx, String title) {
        this.titleIdx = titleIdx;
        this.title = title;
    }

    @Id
    private int titleIdx;

    private String title;

    public int getTitleIdx() {
        return titleIdx;
    }

    public void setTitleIdx(int titleIdx) {
        this.titleIdx = titleIdx;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
