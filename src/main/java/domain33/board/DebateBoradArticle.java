package domain33.board;

import domain33.BulletinBoardArticle;
import domain33.embed.Tendency;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "agendaAndDebateArticle")
public class DebateBoradArticle extends BulletinBoardArticle {

    private List<DebateBoardComment> debateBoardComments = new ArrayList<>();

    @Embedded
    private Tendency tendency;

}
