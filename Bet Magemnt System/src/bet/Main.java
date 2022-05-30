package bet;

import exceptions.EventNotFoundException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws EventNotFoundException {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a stake");
        double stake = s.nextDouble();

        System.out.println("Enter an Event ID");
        int eventID= s.nextInt();

        System.out.println("Enter a Market ID");
        int marketID= s.nextInt();

        Bet b = new Bet(stake,eventID,marketID);

        b.makeBet(stake,eventID,marketID);

    }
}
