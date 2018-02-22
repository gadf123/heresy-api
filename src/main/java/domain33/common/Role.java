package domain33.common;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Role {

    @Id
    @GeneratedValue
    private int idx;

    private String roleName;

    private Date createDate;

    private Date updateDate;
}
