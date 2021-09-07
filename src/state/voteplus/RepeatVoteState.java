package state.voteplus;

public class RepeatVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManger voteManger) {
        System.out.println("请不要重复投票");
        //判断一下，如果恶意投票就改变一下状态
        if (voteManger.getMapVoteCount().get(user) >= 4) {
            voteManger.getMapState().put(user, new SpiteVoteState());
        }
    }
}
