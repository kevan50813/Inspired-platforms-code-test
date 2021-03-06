package test;

import bet.Bet;
import bet.Database;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {

    private Database d;
    private Bet b;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        b = new Bet(100.00,100,55);
        d = new Database();
    }

    @org.junit.jupiter.api.Test
    void testWriteData() {
        assertTrue(d.writeData(b));
    }

    @org.junit.jupiter.api.Test
    void testLogData() {
        assertTrue(d.logData(b.getStake(), b.getEventID(), b.getMarketID()));
    }
}