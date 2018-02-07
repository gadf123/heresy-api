package heresy.domain.user;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class User {

    public User() {
    }

    public User(Long userIdx, String userNickName) {
        this.userIdx = userIdx;
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

    private int tendency;

    // 자기소개
    private String introduction;

    // sns 계정
    private int authSnsIdx;


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

    @Override
    public String toString() {
        return "User{" +
                "userIdx=" + userIdx +
                ", userId='" + userId + '\'' +
                ", userNickName='" + userNickName + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", tendency=" + tendency +
                ", introduction='" + introduction + '\'' +
                ", authSnsIdx=" + authSnsIdx +
                '}';
    }
}
