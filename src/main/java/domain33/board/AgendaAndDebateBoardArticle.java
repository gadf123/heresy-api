package domain33.board;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class AgendaAndDebateBoardArticle {

    @Id
    @GeneratedValue
    private int idx;

    private int subBoardIdx;

    private String title;

    private int userIdx;

    private String userNickName;

    private String content;

    private int good;

    private int bad;

    private Date createDate;

    private Date updateDate;

}
