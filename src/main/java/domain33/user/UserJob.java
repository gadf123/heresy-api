package domain33.user;

import domain33.etc.Job;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class UserJob {

    private int userIdx;

    private int jobIdx;

    @OneToOne
    @JoinColumn(name = "jobIdx")
    private Job job;

}
