package heresy.domain.user;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name= "user")
public class User {

    @Id
    @GeneratedValue
    private int idx;

    private String userId;

    private String userNickName;

    private int experience;

    private int tendency;

    private int introduction;

    private String authSnsId;

    private Date createDate;

    private Date updateDate;

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getTendency() {
        return tendency;
    }

    public void setTendency(int tendency) {
        this.tendency = tendency;
    }

    public int getIntroduction() {
        return introduction;
    }

    public void setIntroduction(int introduction) {
        this.introduction = introduction;
    }

    public String getAuthSnsId() {
        return authSnsId;
    }

    public void setAuthSnsId(String authSnsId) {
        this.authSnsId = authSnsId;
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
