package mediator.computer;


public class CPU extends Colleague {
    public CPU(Mediator mediator) {
        super(mediator);
    }

    //分解拿出来的视频数据
    private String videoData = "";
    //分解得到的音频数据
    private String soundData = "";

    public String getVideoData() {
        return videoData;
    }

    public String getSoundData() {
        return soundData;
    }
    public void executeData(String data){
        String[] ss=data.split("，");
        this.videoData=ss[0];
        this.soundData=ss[1];
        this.getMediator().changed(this);
    }
}
