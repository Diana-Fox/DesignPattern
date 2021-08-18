package mediator.computer;


public class SoundCard extends Colleague {
    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    public void soundData(String data) {
        System.out.println("播放声音：" + data);
    }
}
