package heresy.domain.embed;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Embeddable
public class CommonDate {

    @Temporal(TemporalType.DATE)
    private Date createDate;

    @Temporal(TemporalType.DATE)
    private Date updateDate;

    public boolean isWork(Date date){
        // 필요한것 있으면 정의
        return true;
    }
}
