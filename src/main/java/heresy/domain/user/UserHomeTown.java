package heresy.domain.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class UserHomeTown {

    @Id
    @GeneratedValue
    private int idx;

    private int userIdx;

    private int hometownIdx;

    private Date createDate;

    private Date updateDate;
}
