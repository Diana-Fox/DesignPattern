package state.vote;

public interface VoteState {
    void vote(String user, String voteItem, VoteManger voteManger);
}
