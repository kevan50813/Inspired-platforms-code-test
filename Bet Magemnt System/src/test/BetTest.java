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
        assertTrue(b.makeBet(b.getStake(), b.getEventID(), b.getMarketID()));
    }

    @Test
    void testInputCheck(){
        Bet invlaidBet = new Bet(-100.00,-50,0);
        assertTrue(b.checkInput(b.getStake(), b.getEventID(), b.getMarketID()));
        assertFalse(invlaidBet.checkInput(invlaidBet.getStake(), invlaidBet.getEventID(), invlaidBet.getMarketID()));

    }
}