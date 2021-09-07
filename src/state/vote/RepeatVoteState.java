package state.vote;

public class RepeatVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManger voteManger) {
        System.out.println("请不要重复投票");
    }
}
