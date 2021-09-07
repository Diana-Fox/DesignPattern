package state.vote;

public class Client {
    public static void main(String[] args) {
        VoteManger voteManger = new VoteManger();
        for (int i = 0; i < 10; i++) {
            voteManger.vote("小宝","宝儿");
        }
    }
}
