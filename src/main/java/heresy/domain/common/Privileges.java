package heresy.domain.common;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Privileges {

    @Id
    @GeneratedValue
    private int idx;

    private int roleIdx;

    private Date createDate;

    private Date updateDate;
}
