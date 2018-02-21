package domain33.board;

import domain33.Comment;
import domain33.comment.CommentId;

import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(CommentId.class)
@Table(name = "agendaAndDebateArticleComment")
public class AgendaBoardComment extends Comment {

    private char type;

}
