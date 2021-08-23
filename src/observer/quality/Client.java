package observer.quality;

public class Client {
    public static void main(String[] args) {
        WaterQuality subject = new WaterQuality();

        WaterObserver water1 = new Water();
        water1.setJob("监测人员");
        WaterObserver water2 = new Water();
        water2.setJob("预警人员");
        WaterObserver water3 = new Water();
        water3.setJob("监测部门领导");

        subject.attach(water1);
        subject.attach(water2);
        subject.attach(water3);

        System.out.println("当水质正常的时候");
        subject.setPolluteLevel(0);
        System.out.println("当水质轻度污染的时候");
        subject.setPolluteLevel(1);
        System.out.println("当水质重度污染的时候");
        subject.setPolluteLevel(2);
    }
}
