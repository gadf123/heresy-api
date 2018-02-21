package domain.user;

import domain.etc.Job;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class UserJob {

    private int userIdx;

    private int jobIdx;

    @OneToOne
    @JoinColumn(name = "jobIdx")
    private Job job;

}
