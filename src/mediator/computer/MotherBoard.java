package mediator.computer;


/**
 * 主板类相当于中介者的实现
 */
public class MotherBoard implements Mediator {
    private CDDriver cdDriver = null;
    private CPU cpu = null;
    private VideoCard videoCard = null;
    private SoundCard soundCard = null;

    public void setCdDriver(CDDriver cdDriver) {
        this.cdDriver = cdDriver;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    @Override
    public void changed(Colleague colleague) {
        if (colleague == cdDriver) {
            this.openCDDriverReadData((CDDriver) colleague);
        } else if (colleague == cpu) {
            this.openCPU((CPU)colleague);
        }
    }

    //处理光驱读取数据过后
    private void openCDDriverReadData(CDDriver cd) {
        //拿出读取到的数据
        String data = cd.getData();
        //交给CPU去处理
        this.cpu.executeData(data);
    }
    //CPU处理完成，和其他对象交互
    private void openCPU(CPU cpu) {
        //CPU处理后的数据传递给声卡显卡
        soundCard.soundData(cpu.getSoundData());
        videoCard.showData(cpu.getVideoData());
    }

}
