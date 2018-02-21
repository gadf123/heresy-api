package domain33.board;

import javax.persistence.*;
import java.util.Date;

@Entity
public class UploadFiles {

    @Id
    @GeneratedValue
    private Long idx;

    private Long subjectId;

    private String filename;

    @Temporal(TemporalType.DATE)
    private Date uploadDate;

}
