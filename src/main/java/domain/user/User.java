package domain.user;

import domain.embed.CommonDate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long userIdx;

    private String userId;

    private String userNickName;

    private int level;

    private int tendency;

    @OneToOne
    @JoinColumn(name = "userIdx")
    private UserHomeTown userHometown;

    // 호칭
    @OneToMany
    @JoinColumn(name = "userIdx")
    private List<UserTitle> myTitles = new ArrayList<>();

    // 자기소개
    private String introduction;

    // sns 계정
    private int authSnsIdx;

    @Embedded
    private CommonDate commonDate;

}
