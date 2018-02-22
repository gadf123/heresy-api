package heresy.domain;

import heresy.domain.embed.CommonDate;
import heresy.domain.embed.Recommend;

import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Comment {

    @Id
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

    public Long getIdx() {
        return idx;
    }

    public void setIdx(Long idx) {
        this.idx = idx;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getUserIdx() {
        return userIdx;
    }

    public void setUserIdx(int userIdx) {
        this.userIdx = userIdx;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public int getLinkedIdx() {
        return linkedIdx;
    }

    public void setLinkedIdx(int linkedIdx) {
        this.linkedIdx = linkedIdx;
    }

    public Recommend getRecommend() {
        return recommend;
    }

    public void setRecommend(Recommend recommend) {
        this.recommend = recommend;
    }

    public CommonDate getCommonDate() {
        return commonDate;
    }

    public void setCommonDate(CommonDate commonDate) {
        this.commonDate = commonDate;
    }
}
