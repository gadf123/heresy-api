package domain.comment;

import java.io.Serializable;
import java.util.Objects;

public class CommentId implements Serializable{

    private Long subjectId;
    private Long commentId;

    public CommentId(){

    }

    public CommentId(Long subjectId, Long commentId) {
        this.subjectId = subjectId;
        this.commentId = commentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentId commentId1 = (CommentId) o;
        return Objects.equals(subjectId, commentId1.subjectId) &&
                Objects.equals(commentId, commentId1.commentId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(subjectId, commentId);
    }
}
