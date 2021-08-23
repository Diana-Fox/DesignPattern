package observer.quality;

public class WaterQuality extends WaterQualitySubject {
    //水质污染级别
    private int polluteLevel = 0;

    public int getPolluteLevel() {
        return polluteLevel;
    }

    public void setPolluteLevel(int polluteLevel) {
        this.polluteLevel = polluteLevel;
        notifyWatchers();
    }

    public void notifyWatchers() {
        for (WaterObserver watcher :
                observers) {
            if (this.polluteLevel >= 0) {
                if ("监测人员".equals(watcher.getJob())) {
                    watcher.update(this);
                }
            }
            if (this.polluteLevel >= 1) {
                if ("预警人员".equals(watcher.getJob())) {
                    watcher.update(this);
                }
            }
            if (this.polluteLevel >= 2) {
                if ("监测部门领导".equals(watcher.getJob())) {
                    watcher.update(this);
                }
            }
        }
    }
}
