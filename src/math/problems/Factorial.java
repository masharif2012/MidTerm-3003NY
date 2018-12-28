package math.problems;
import java.util.Scanner;

/**                                                     .......PALASH............
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

            // By using Iteration..
        int f =5;
        int fac =1;

        for (int k=1; k<=f; k++) {
            fac = fac *k;
            //System.out.println("The factorial Variable is: " +fac);
        }
        System.out.println("So The factorial of 5 is: " +fac);

        //Recursion part........

        int n;
        long result;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter your input to see the result ");
        n=scanner.nextInt();
        result=factorial(n);
        System.out.println(result);

    }

    public static int factorial(int n) {
        if (n==0) {
            return 1;
        }
        else {
            return n* factorial(n-1);
        }



    }
}
