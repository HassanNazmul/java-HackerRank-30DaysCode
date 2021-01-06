import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables. */
        // Note: If you have trouble reading the entire String, please go back and
        // review the Tutorial closely.
        int input_int;
        input_int = scan.nextInt();

        double input_double;
        input_double = scan.nextDouble();

        scan.nextLine();
        String input_string;
        input_string = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + input_int);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + input_double);

        /*
         * Concatenate and print the String variables on a new line; the 's' variable
         * above should be printed first.
         */

        System.out.println(s + input_string);

        scan.close();
    }
}