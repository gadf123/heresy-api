package heresy.domain.common;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Title {

    @Id
    @GeneratedValue
    private int idx;

    private String title;

    private Date createDate;

    private Date updateDate;
}
