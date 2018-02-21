package heresy.domain.etc;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HomeTown {

    public HomeTown(int hometownIdx, String homeTownName) {
        this.hometownIdx = hometownIdx;
        this.homeTownName = homeTownName;
    }

    @Id
    private int hometownIdx;

    private String homeTownName;

    public int getHometownIdx() {
        return hometownIdx;
    }

    public void setHometownIdx(int hometownIdx) {
        this.hometownIdx = hometownIdx;
    }

    public String getHomeTownName() {
        return homeTownName;
    }

    public void setHomeTownName(String homeTownName) {
        this.homeTownName = homeTownName;
    }
}
