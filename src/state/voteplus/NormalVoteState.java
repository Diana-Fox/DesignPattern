package state.voteplus;

public class NormalVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManger voteManger) {
        voteManger.getMapVote().put(user,voteItem);
        System.out.println("恭喜投票成功！");

        //正常投票完成，维护下一个状态，同一个人在投票就重复了
        voteManger.getMapState().put(user,new RepeatVoteState());
    }
}
