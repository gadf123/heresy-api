package heresy.domain.common;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Level {

    @Id
    @GeneratedValue
    private int idx;

    private int degree;

    private int level;

    private int experience;

}
