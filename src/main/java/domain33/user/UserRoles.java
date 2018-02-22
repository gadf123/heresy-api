package domain33.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class UserRoles {

    @Id
    @GeneratedValue
    private int idx;

    private int userIdx;

    private int roleIdx;

    private Date createDate;

    private Date updateDate;

}
