package bet;

public interface DatabaseFactory {

    boolean writeData(Bet b);
    boolean logData(double stake,int eventID,int marketID);
}
