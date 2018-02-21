package heresy.domain.board;

import heresy.domain.BulletinBoardArticle;
import heresy.domain.embed.Tendency;

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
