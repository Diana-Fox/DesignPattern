package observer.quality;

public interface WaterObserver {
    void update(WaterQualitySubject subject);

    String getJob();

    void setJob(String job);

}
