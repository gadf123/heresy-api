package heresy.domain.board;

import heresy.domain.Comment;
import heresy.domain.comment.CommentId;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
//@IdClass(CommentId.class)
@Table(name = "agendaAndDebateArticleComment")
public class DebateBoardComment extends Comment {

    @Id
    private int idx;

    private char type;

}
