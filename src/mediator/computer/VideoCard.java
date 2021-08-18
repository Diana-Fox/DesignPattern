package mediator.computer;


public class VideoCard extends Colleague {
    public VideoCard(Mediator mediator) {
        super(mediator);
    }

    public void showData(String data) {
        System.out.println("播放画面：" + data);
    }
}
