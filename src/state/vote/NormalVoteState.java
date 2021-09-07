package state.vote;

public class NormalVoteState implements VoteState{
    @Override
    public void vote(String user, String voteItem, VoteManger voteManger) {
        voteManger.getMapVote().put(user,voteItem);
        System.out.println("恭喜投票成功！");
    }
}
