package f17oct3comp1030;

import java.security.SecureRandom;

/**
 *
 * @author JWright
 */
public class Craps {
    private enum Status {CONTINUE, WON, LOST};
    
    //common "Vegas" terms
    private static final int SNAKE_EYES=2;
    private static final int TREY=3;
    private static final int SEVEN=7;
    private static final int YO_LEVEN=11;
    private static final int BOXCARS=12;
    
    public static void main(String[] args)
    {
        int sumOfDice, myPoint;
        Status gameStatus = Status.CONTINUE;
        
        sumOfDice = rollDice();
        
        if (sumOfDice == SEVEN || sumOfDice == YO_LEVEN)
            gameStatus = Status.WON;
        
        else if (sumOfDice == SNAKE_EYES || sumOfDice == TREY || sumOfDice == BOXCARS)
            gameStatus = Status.LOST;
        
        myPoint = sumOfDice;
        
        while (gameStatus == Status.CONTINUE)
        {
            sumOfDice = rollDice();
            
            if (sumOfDice == myPoint)
                gameStatus = Status.WON;
            
            else if (sumOfDice == SEVEN)
                gameStatus = Status.LOST;
        }
        
        if (gameStatus == Status.WON)
            System.out.println("\nSteve wins!");
        else
            System.out.println("\nThe house wins...and the house always wins");
    } // end of main method
    
    
    /**
     * This method will simulate rolling 2 dice and return their sum
     */
    public static int rollDice()
    {
        //this is a random number generator
        SecureRandom rng = new SecureRandom();
        int die1 = rng.nextInt(6)+1;
        int die2 = rng.nextInt(6)+1;
        
        System.out.printf("Die 1: %d  die 2: %d and the sum is %d%n", die1, die2, die1+die2);
        return die1+die2;
    }
}
