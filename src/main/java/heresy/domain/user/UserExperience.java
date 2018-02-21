package heresy.domain.user;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserExperience {

    public UserExperience(int idx, int userIdx, int experience, int degree) {
        this.idx = idx;
        this.userIdx = userIdx;
        this.experience = experience;
        this.degree = degree;
    }

    @Id
    private int idx;

    private int userIdx;

    private int experience;

    private int degree;

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public int getUserIdx() {
        return userIdx;
    }

    public void setUserIdx(int userIdx) {
        this.userIdx = userIdx;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }
}
