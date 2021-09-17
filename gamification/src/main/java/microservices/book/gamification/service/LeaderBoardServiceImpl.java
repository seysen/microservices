package microservices.book.gamification.service;

import microservices.book.gamification.domain.LeaderBoardRow;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaderBoardServiceImpl implements LeaderBoardService {
    @Override
    public List<LeaderBoardRow> getCurrentLeaderBoard() {
        return null;
    }
}
