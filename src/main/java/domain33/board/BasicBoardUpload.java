package domain33.board;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class BasicBoardUpload {

    @Id
    @GeneratedValue
    private int idx;

    private String fileName;

    private int articleIdx;

    private int userIdx;

    private Date createDate;

    private Date updateDate;

}
