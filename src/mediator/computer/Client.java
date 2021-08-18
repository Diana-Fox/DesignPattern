package mediator.computer;

public class Client {
    public static void main(String[] args) {
        //先创建中介者主板
        MotherBoard motherBoard = new MotherBoard();
        //创建同事类
        CDDriver cdDriver = new CDDriver(motherBoard);
        CPU cpu = new CPU(motherBoard);
        VideoCard videoCard = new VideoCard(motherBoard);
        SoundCard soundCard = new SoundCard(motherBoard);
        //中介者关联所有同事类
        motherBoard.setCdDriver(cdDriver);
        motherBoard.setCpu(cpu);
        motherBoard.setSoundCard(soundCard);
        motherBoard.setVideoCard(videoCard);
        //开始读取CD
        cdDriver.readCD();

    }
}
