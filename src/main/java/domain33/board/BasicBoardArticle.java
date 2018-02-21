package domain33.board;

import domain33.BulletinBoardArticle;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class BasicBoardArticle extends BulletinBoardArticle {

    @OneToMany
    @JoinColumn(name = "subjectId")
    private List<BasicBoardComment> basicBoardCommentList = new ArrayList<>();

}
