package bet;

public class Bet {
    private double stake = 0.0;
    private int eventID = 0;
    private int marketID = 0;
    private Database database;

    public double getStake() {
        return stake;
    }

    public void setStake(double stake) {
        this.stake = stake;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public int getMarketID() {
        return marketID;
    }

    public void setMarketID(int marketID) {
        this.marketID = marketID;
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    public Bet(double stake,int eventID,int marketID){
        this.stake=stake;
        this.eventID=eventID;
        this.marketID=marketID;
        database = new Database();
    }

    public boolean makeBet(double stake,int eventID,int marketID){
        boolean stakeWritten = database.writeData(this); // write data to databse

        if(stakeWritten){
            // a recipt of sorts -- just rpints what the user enterd
            System.out.println("Stake succesfuly added to database");
            System.out.println("Data added:");
            System.out.println("Stake : £"+stake);
            System.out.println("Event ID : "+eventID);
            System.out.println("Market ID : "+marketID);
            return true;
        }
        else{
            return false;
        }
        
    }
}
