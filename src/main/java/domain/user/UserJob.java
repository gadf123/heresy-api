package domain.user;

import domain.etc.Job;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class UserJob {

    private int idx;

    private int userIdx;

    private int jobId;

    @OneToOne
    @JoinColumn(name = "jobId")
    private Job job;

}
