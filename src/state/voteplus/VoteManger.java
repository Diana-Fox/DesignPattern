package state.voteplus;

import java.util.HashMap;
import java.util.Map;

public class VoteManger {
    //记录当前每个用户对应的状态处理对象，每个用户当前的状态是不同的
    private Map<String, VoteState> mapState= new HashMap<>();;

    //投票人和选项
    private Map<String, String> mapVote = new HashMap<>();

    //投票人和票数
    private Map<String, Integer> mapVoteCount = new HashMap<>();

    public Map<String, VoteState> getMapState() {
        return mapState;
    }

    public void setMapState(Map<String, VoteState> mapState) {
        this.mapState = mapState;
    }

    public Map<String, String> getMapVote() {
        return mapVote;
    }

    public void setMapVote(Map<String, String> mapVote) {
        this.mapVote = mapVote;
    }

    public Map<String, Integer> getMapVoteCount() {
        return mapVoteCount;
    }

    public void setMapVoteCount(Map<String, Integer> mapVoteCount) {
        this.mapVoteCount = mapVoteCount;
    }

    public void vote(String user, String voteItem) {
        Integer oldVoteCount = mapVoteCount.get(user);
        if (oldVoteCount == null) {
            oldVoteCount = 0;
        }
        mapVoteCount.put(user, ++oldVoteCount);
        //获取该用户的投票状态
        VoteState state = mapState.get(user);
        if (state == null) {
            state = new NormalVoteState();
        }
        state.vote(user, voteItem, this);
    }

}
