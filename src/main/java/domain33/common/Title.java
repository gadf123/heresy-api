package domain33.common;

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

    private int seasonIdx;

    private int rating;

    private int img;

    private Date createDate;

    private Date updateDate;
}
