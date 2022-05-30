package bet;

import java.io.FileReader;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * this class reperates the databse , for simplaicty reasons this will just read for a csv for now
 */
public class Database {
    static final String DATA = "data.csv"; // tmep file for database

    public boolean writeData(Bet b){
        //write the data to a databas for now this is a basic csv, but the logic should hold for databse with minor chages

        try{
            logData(b.getStake(),b.getEventID(),b.getMarketID());
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }

    }

    public boolean logData(double stake,int eventID,int marketID){
        try{
            Logger logger = Logger.getLogger("DataLog");
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
            e.printStackTrace();
            return false;
        }
    }

}
