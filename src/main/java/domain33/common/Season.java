package domain33.common;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Season {

    @Id
    @GeneratedValue
    private int seasonIdx;

    private String seasonTitle;

    private Date startDate;

    private Date endDate;

}
