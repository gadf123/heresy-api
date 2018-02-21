package domain.user;

import domain.embed.CommonDate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long userIdx;

    private String userId;

    private String userNickName;

    private String password;

    @Transient
    private String confirmPassword;

    private int experience;

    private int tendency;

    @ManyToMany
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles;

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
    private String authSnsId;

    @Embedded
    private CommonDate commonDate;

}
