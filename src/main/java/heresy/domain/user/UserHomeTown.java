package heresy.domain.user;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserHomeTown {

    public UserHomeTown(int userIdx) {
        this.userIdx = userIdx;
    }

    @Id
    private int userIdx;
//
//    @OneToOne
//    @JoinColumn(name = "hometownIdx")
//    private HomeTown homeTown;


    public int getUserIdx() {
        return userIdx;
    }

    public void setUserIdx(int userIdx) {
        this.userIdx = userIdx;
    }
}
