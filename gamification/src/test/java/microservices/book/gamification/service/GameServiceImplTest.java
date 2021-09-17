package microservices.book.gamification.service;

import microservices.book.gamification.repository.BadgeCardRepository;
import microservices.book.gamification.repository.ScoreCardRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class GameServiceImplTest {

    private GameServiceImpl gameService;

    @Mock
    private BadgeCardRepository badgeCardRepository;

    @Mock
    private ScoreCardRepository scoreCardRepository;

    @Before
    public void setUp() {
        gameService = new GameServiceImpl(badgeCardRepository, scoreCardRepository);
    }

    @Test
    public void firstWonTest() {

    }

    @Test
    public void bronzeBadgeTest() {

    }

    @Test
    public void silverBadgeTest() {

    }

    @Test
    public void goldBadgeTest() {

    }
}
