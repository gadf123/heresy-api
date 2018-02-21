package heresy.domain.etc;

import javax.persistence.Id;

public class Level {

    public Level(int idx, int degree, int level, int experience) {
        this.idx = idx;
        this.degree = degree;
        this.level = level;
        this.experience = experience;
    }

    @Id
    private int idx;

    private int degree;

    private int level;

    private int experience;

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
