package domain33;

import domain33.embed.CommonDate;
import domain33.embed.Recommend;

import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Comment {

    @GeneratedValue
    private Long idx;

    private String comment;

    private int userIdx;

    private String userNickName;

    private int linkedIdx;

    @Embedded
    private Recommend recommend;

    @Embedded
    private CommonDate commonDate;
}
