package heresy.domain.embed;

import javax.persistence.Embeddable;

@Embeddable
public class Recommend {
    private int good;

    private int bad;

    private boolean isGood(){
        return good > bad;
    }
}
