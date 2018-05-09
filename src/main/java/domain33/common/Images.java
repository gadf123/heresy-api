package domain33.common;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Images {

    @Id
    @GeneratedValue
    private int imageIdx;

    private int imageId;

    private String imageName;

    private String src;
}
