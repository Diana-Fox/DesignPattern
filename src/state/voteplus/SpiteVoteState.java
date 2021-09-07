package state.voteplus;

public class SpiteVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManger voteManger) {
        String s = voteManger.getMapVote().get(user);
        if (s != null) {
            voteManger.getMapVote().remove(user);
        }
        System.out.println("你有恶意刷票行为，取消投票资格。");
        if (voteManger.getMapVoteCount().get(user) >= 7) {
            voteManger.getMapState().put(user, new BlackVoteState());
        }
    }
}
