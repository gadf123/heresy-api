package domain.board;

import domain.Comment;
import domain.comment.CommentId;

import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(CommentId.class)
@Table(name = "agendaAndDebateArticleComment")
public class DebateBoardComment extends Comment {

    private char type;

}
