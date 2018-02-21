package domain33.user;

import domain33.etc.Titles;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class UserTitle {
    private int userIdx;

    private int userTitleIdx;

    @OneToOne
    @JoinColumn(name = "userTitleIdx;")
    private Titles userTitles;

    // 1 : set, 2 : unset
    private char setTitle;
}
