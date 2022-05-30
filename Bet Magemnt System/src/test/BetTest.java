package test;

import bet.Bet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BetTest {

    private Bet b;

    @BeforeEach
    void setUp() {
        b = new Bet(200.00,55,100);
    }

    @Test
    void testMakeBet() {
        assertEquals(b.makeBet(b.getStake(),b.getEventID(),b.getMarketID()),true);
    }
}