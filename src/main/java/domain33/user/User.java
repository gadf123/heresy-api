package domain33.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.Date;

@Entity
public class User {

    @Id
    @GeneratedValue
    private int idx;

    private String userId;

    private String userNickName;

    private String password;

    @Transient
    private String confirmPassword;

    private int experience;

    private int tendency;

    private int introduction;

    private String authSnsId;

    private Date createDate;

    private Date updateDate;

}
