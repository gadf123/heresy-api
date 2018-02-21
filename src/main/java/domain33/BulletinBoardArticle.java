package domain33;

import domain33.board.UploadFiles;
import domain33.embed.CommonDate;
import domain33.embed.Recommend;

import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.ArrayList;
import java.util.List;

@MappedSuperclass
public abstract class BulletinBoardArticle {

    @Id
    @GeneratedValue
    private Long idx;

    private Long subBoardIdx;

    private String subject;

    private int userIdx;

    private String userNickName;

    private String content;

    private List<UploadFiles> uploadImages = new ArrayList<>();

    @Embedded
    private Recommend recommend;

    @Embedded
    private CommonDate articleDate;
}
