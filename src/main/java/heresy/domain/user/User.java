package heresy.domain.user;

import heresy.domain.embed.CommonDate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
//@Table(name = "User")
public class User {

    public User(String userId, String userNickName, String password, String confirmPassword, UserExperience userExperience, int tendency, UserHomeTown userHometown, List<UserTitle> myTitles, UserJob userJob, String introduction, int authSnsIdx, CommonDate commonDate) {
        this.userId = userId;
        this.userNickName = userNickName;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.userExperience = userExperience;
        this.tendency = tendency;
        this.userHometown = userHometown;
        this.myTitles = myTitles;
        this.userJob = userJob;
        this.introduction = introduction;
        this.authSnsIdx = authSnsIdx;
        this.commonDate = commonDate;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long userIdx;

    private String userId;

    private String userNickName;

    private String password;

    @Transient
    private String confirmPassword;

    @OneToOne
    @JoinColumn(name = "userIdx")
    private UserExperience userExperience;

    private int tendency;
//

    @OneToOne
    @JoinColumn(name = "userIdx")
    private UserHomeTown userHometown;

    // 호칭
    @OneToMany
    @JoinColumn(name = "userIdx")
    private List<UserTitle> myTitles = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "userIdx")
    private UserJob userJob;

    // 자기소개
    private String introduction;

    // sns 계정
    private int authSnsIdx;

    @Embedded
    private CommonDate commonDate;

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

    public UserExperience getUserExperience() {
        return userExperience;
    }

    public void setUserExperience(UserExperience userExperience) {
        this.userExperience = userExperience;
    }

    public int getTendency() {
        return tendency;
    }

    public void setTendency(int tendency) {
        this.tendency = tendency;
    }
//
//    public Collection<Role> getRoles() {
//        return roles;
//    }
//
//    public void setRoles(Collection<Role> roles) {
//        this.roles = roles;
//    }

    public UserHomeTown getUserHometown() {
//    @ManyToMany
//    @JoinTable(
//            name = "users_roles",
//            joinColumns = @JoinColumn(
//                    name = "user_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(
//                    name = "role_id", referencedColumnName = "id"))
//    private Collection<Role> roles;
        return userHometown;
    }

    public void setUserHometown(UserHomeTown userHometown) {
        this.userHometown = userHometown;
    }

    public List<UserTitle> getMyTitles() {
        return myTitles;
    }

    public void setMyTitles(List<UserTitle> myTitles) {
        this.myTitles = myTitles;
    }

    public UserJob getUserJob() {
        return userJob;
    }

    public void setUserJob(UserJob userJob) {
        this.userJob = userJob;
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

    public CommonDate getCommonDate() {
        return commonDate;
    }

    public void setCommonDate(CommonDate commonDate) {
        this.commonDate = commonDate;
    }
}
