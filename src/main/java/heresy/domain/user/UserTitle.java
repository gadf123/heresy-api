package heresy.domain.user;

import javax.persistence.*;

@Entity
//@Table(name = "UserTitle")
public class UserTitle {

    public UserTitle(int userIdx, int userTitleIdx, char setTitle) {
        this.userIdx = userIdx;
        this.userTitleIdx = userTitleIdx;
        this.setTitle = setTitle;
    }

    @Id
    private int userIdx;

    private int userTitleIdx;
//
//    @OneToOne
//    @JoinColumn(name = "userTitleIdx")
//    private Titles userTitles;

    // 1 : set, 2 : unset
    private char setTitle;


    public int getUserIdx() {
        return userIdx;
    }

    public void setUserIdx(int userIdx) {
        this.userIdx = userIdx;
    }

    public int getUserTitleIdx() {
        return userTitleIdx;
    }

    public void setUserTitleIdx(int userTitleIdx) {
        this.userTitleIdx = userTitleIdx;
    }

    public char getSetTitle() {
        return setTitle;
    }

    public void setSetTitle(char setTitle) {
        this.setTitle = setTitle;
    }
}
