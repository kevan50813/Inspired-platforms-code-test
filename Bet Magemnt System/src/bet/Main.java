package bet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a stake");
        double stake = s.nextDouble();
        while (stake <= 0.0){
            System.out.println("Invalid input try again: ");
            stake = s.nextDouble();
        }


        System.out.println("Enter an Event ID");
        int eventID= s.nextInt();
        while (eventID <= 0 ){
            System.out.println("Invalid input try again: ");
            eventID= s.nextInt();
        }

        System.out.println("Enter a Market ID");
        int marketID= s.nextInt();
        while (marketID <= 0){
            System.out.println("Invalid input try again: ");
            marketID = s.nextInt();
        }


        Bet b = new Bet(stake,eventID,marketID);
        b.makeBet(stake,eventID,marketID);

    }
}
