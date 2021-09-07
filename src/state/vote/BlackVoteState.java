package state.vote;

public class BlackVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManger voteManger) {
        System.out.println("进入黑名单，不允许登录。");
    }
}
