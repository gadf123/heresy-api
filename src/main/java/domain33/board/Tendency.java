package domain33.board;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Tendency {

    @Id
    private int idx;

    private int superRight;

    private int superLeft;

    private int right;

    private int left;

    private Date createDate;

    private Date updateDate;

}
