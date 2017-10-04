
package f17oct3comp1030;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class F17Oct3COMP1030 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number1 = keyboard.nextInt();
        
        System.out.print("Please enter another number: ");
        int number2 = keyboard.nextInt();
        
        System.out.printf("The sum of %d + %d = %d%n",
                                number1, number2, sum(number1, number2));
    }                                           
    
    
    public static int sum(int num1, int num2)
    {
        return num1+num2;   
    }
}
