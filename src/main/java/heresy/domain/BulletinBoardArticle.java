package heresy.domain;

import heresy.domain.embed.CommonDate;
import heresy.domain.embed.Recommend;

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

//    private List<UploadFiles> uploadImages = new ArrayList<>();

    @Embedded
    private Recommend recommend;

    @Embedded
    private CommonDate articleDate;

    public Long getIdx() {
        return idx;
    }

    public void setIdx(Long idx) {
        this.idx = idx;
    }

    public Long getSubBoardIdx() {
        return subBoardIdx;
    }

    public void setSubBoardIdx(Long subBoardIdx) {
        this.subBoardIdx = subBoardIdx;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

//    public List<UploadFiles> getUploadImages() {
//        return uploadImages;
//    }

//    public void setUploadImages(List<UploadFiles> uploadImages) {
//        this.uploadImages = uploadImages;
//    }

    public Recommend getRecommend() {
        return recommend;
    }

    public void setRecommend(Recommend recommend) {
        this.recommend = recommend;
    }

    public CommonDate getArticleDate() {
        return articleDate;
    }

    public void setArticleDate(CommonDate articleDate) {
        this.articleDate = articleDate;
    }
}
