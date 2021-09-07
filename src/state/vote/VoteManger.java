package state.vote;

import java.util.HashMap;
import java.util.Map;

public class VoteManger {
    //持有状态处理
    private VoteState state;
    //投票人和选项
    private Map<String, String> mapVote = new HashMap<>();

    //投票人和票数
    private Map<String, Integer> mapVoteCount = new HashMap<>();

    public Map<String, String> getMapVote() {
        return mapVote;
    }

    public void setMapVote(Map<String, String> mapVote) {
        this.mapVote = mapVote;
    }

    public void vote(String user, String voteItem) {
        Integer oldVoteCount = mapVoteCount.get(user);
        if (oldVoteCount == null) {
            oldVoteCount = 0;
        }
        oldVoteCount++;
        mapVoteCount.put(user, oldVoteCount);
        if (oldVoteCount == 1) {
            state = new NormalVoteState();
        } else if (oldVoteCount > 1 && oldVoteCount < 5) {
            state = new RepeatVoteState();
        } else if (oldVoteCount >= 5 && oldVoteCount <= 8) {
            state = new SpiteVoteState();
        } else if (oldVoteCount >= 8) {
            state = new BlackVoteState();
        }
        state.vote(user, voteItem, this);
    }

}
