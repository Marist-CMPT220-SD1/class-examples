package misc;

import java.util.Scanner;

public class TestDoWhile {
    /**
     * Main method
     */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        int sum = getAndSumData(input);

        System.out.println("The sum is " + sum);

        sum = getAndSumData(input);

        System.out.println("The sum is " + sum);

        int x = 10 + getAndSumData(input);

        System.out.println("x is " + x);
    }

    public static int getAndSumData(Scanner input) {
        int data;
        int sum = 0;

        // Keep reading data until the input is 0
        do {           // Read the next data
            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();
            sum += data;
        } while (data != 0);

        return sum;
    }
}
