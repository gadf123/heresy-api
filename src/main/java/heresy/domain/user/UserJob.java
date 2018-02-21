package heresy.domain.user;

import heresy.domain.etc.Job;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class UserJob {

    public UserJob(int idx, int userIdx, int jobId, Job job) {
        this.idx = idx;
        this.userIdx = userIdx;
        this.jobId = jobId;
//        this.job = job;
    }

    @Id
    private int idx;

    private int userIdx;

    private int jobId;
//
//    @OneToOne
//    @JoinColumn(name = "jobId")
//    private Job job;

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public int getUserIdx() {
        return userIdx;
    }

    public void setUserIdx(int userIdx) {
        this.userIdx = userIdx;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }
//
//    public Job getJob() {
//        return job;
//    }
//
//    public void setJob(Job job) {
//        this.job = job;
//    }
}
