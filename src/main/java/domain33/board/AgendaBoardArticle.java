package domain33.board;

import domain33.BulletinBoardArticle;
import domain33.embed.Tendency;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "agendaAndDebateArticle")
public class AgendaBoardArticle extends BulletinBoardArticle {

    @OneToMany
    @JoinColumn(name = "subjectId")
    private List<AgendaBoardComment> agendaBoardComments = new ArrayList<>();

    @Embedded
    private Tendency tendency;

}
