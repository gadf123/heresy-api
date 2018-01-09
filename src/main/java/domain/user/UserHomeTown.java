package domain.user;

import domain.etc.HomeTown;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class UserHomeTown {

    private int userIdx;

    @OneToOne
    @JoinColumn(name = "hometownIdx")
    private HomeTown homeTown;

}
