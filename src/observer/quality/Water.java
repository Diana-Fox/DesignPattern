package observer.quality;

public class Water implements WaterObserver {
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void update(WaterQualitySubject subject) {
        System.out.println(job + "获取到通知，当前污染级别为：" + subject.getPolluteLevel());
    }
}
