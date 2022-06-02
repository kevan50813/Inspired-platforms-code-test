package bet;

public interface DatabaseFactory {

    public abstract boolean writeData(Bet b);
    public abstract boolean logData(double stake,int eventID,int marketID);
}
