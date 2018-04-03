package heresy.domain.board;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Tendency {

    @Id
    private int idx;

    private int superRight;

    private int superLeft;

    private int rright;

    private int lleft;

    private Date createDate;

    private Date updateDate;

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public int getSuperRight() {
        return superRight;
    }

    public void setSuperRight(int superRight) {
        this.superRight = superRight;
    }

    public int getSuperLeft() {
        return superLeft;
    }

    public void setSuperLeft(int superLeft) {
        this.superLeft = superLeft;
    }

    public int getRright() {
        return rright;
    }

    public void setRright(int rright) {
        this.rright = rright;
    }

    public int getLleft() {
        return lleft;
    }

    public void setLleft(int lleft) {
        this.lleft = lleft;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
