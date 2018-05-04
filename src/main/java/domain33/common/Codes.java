package domain33.common;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Codes {

    @Id
    @GeneratedValue
    private int codeIdx;

    private int codeId;

    private String codeName;

    private String comment;

    private int upperId;

    private String src;
}
