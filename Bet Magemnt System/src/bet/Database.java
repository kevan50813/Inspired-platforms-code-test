package bet;

import java.io.FileReader;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * this class reperates the databse , for simplaicty reasons this will not connect to a databse for now but the framework is there
 */
public class Database implements DatabaseFactory {

    @Override
    public boolean writeData(Bet b){
        //write the data to a databas for now this has no datbase wring logic so will just return true after it logs the request

        try{
            System.out.println("Writing data to database --- NOT IMPLEMENTED FOR THE PURPOSES OF THIS TEST");
            logData(b.getStake(),b.getEventID(),b.getMarketID());
            //TODO Write to database: for simaplicty reaosn the databse dose not exsit yet
            return true;
        } catch (Exception e){
            System.out.println("An error occurred when writing to database");
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean logData(double stake,int eventID,int marketID){
        Logger logger = Logger.getLogger("DataLog");
        try{
            FileHandler fh = new FileHandler("DataLog.log");
            StringBuilder sb1= new StringBuilder();
            sb1.append("Stake : £"+ stake);

            StringBuilder sb2= new StringBuilder();
            sb2.append("Event ID: "+eventID);

            StringBuilder sb3= new StringBuilder();
            sb3.append("market ID: " + marketID);

            logger.addHandler(fh);
            SimpleFormatter simpleFormatter = new SimpleFormatter();
            fh.setFormatter(simpleFormatter);
            logger.log(Level.INFO,"New data added");
            logger.log(Level.INFO,sb1.toString());
            logger.log(Level.INFO,sb2.toString());
            logger.log(Level.INFO,sb3.toString());

            return true;
        }
        catch (Exception e){
            logger.log(Level.SEVERE,"An execption occured when trying to log the data");
            e.printStackTrace();
            return false;
        }
    }

}
