package heresy.domain.user;


import lombok.Data;

import javax.persistence.*;

@Entity
public class User {

    public User() {}

    public Long getUserIdx() {
        return userIdx;
    }

    public void setUserIdx(Long userIdx) {
        this.userIdx = userIdx;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getTendency() {
        return tendency;
    }

    public void setTendency(int tendency) {
        this.tendency = tendency;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public int getAuthSnsIdx() {
        return authSnsIdx;
    }

    public void setAuthSnsIdx(int authSnsIdx) {
        this.authSnsIdx = authSnsIdx;
    }

    public User(Long UserId, String userNickName) {
        this.userId = userId;
        this.userNickName = userNickName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userIdx;

    private String userId;

    private String userNickName;

    private String password;

    @Transient
    private String confirmPassword;

    private int level;

    private int tendency;

    // 자기소개
    private String introduction;

    // sns 계정
    @Override
    public String toString() {
        return "User{" +
                "userIdx=" + userIdx +
                ", userId='" + userId + '\'' +
                ", userNickName='" + userNickName + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", level=" + level +
                ", tendency=" + tendency +
                ", introduction='" + introduction + '\'' +
                ", authSnsIdx=" + authSnsIdx +
                '}';
    }

    private int authSnsIdx;

}
