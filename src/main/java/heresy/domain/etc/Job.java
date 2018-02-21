package heresy.domain.etc;

import javax.persistence.Id;

public class Job {

    public Job(int idx, int degree, int jobId, int jobName) {
        this.idx = idx;
        this.degree = degree;
        this.jobId = jobId;
        this.jobName = jobName;
    }

    @Id
    private int idx;

    private int degree;

    private int jobId;

    private int jobName;

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public int getJobName() {
        return jobName;
    }

    public void setJobName(int jobName) {
        this.jobName = jobName;
    }
}
