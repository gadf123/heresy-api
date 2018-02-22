package domain33.board;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class BasicBoardComment {

    @Id
    @GeneratedValue
    private int idx;

    private int articleIdx;

    private int userIdx;

    private String comment;

    private int good;

    private int bad;

    private Date createDate;

    private Date updateDate;
}
