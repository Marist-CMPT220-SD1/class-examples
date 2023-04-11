package misc;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int data;
        int count = -1; // TODO - fill in this initialization
        int sum = 0;
        do {
            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();
            sum += data;
            count++; // TODO - increment count
        } while ( data != 0 ); // TODO - continuation test
        double avg = sum / (double)count;
        System.out.println(avg);
    }
}