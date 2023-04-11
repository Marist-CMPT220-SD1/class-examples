package misc;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("What is the current temperature? ");
        double temperature = kbd.nextDouble();
        int size = 10;
        if (temperature > 90) {
            System.out.print("Wow, it's hot today!");
            System.out.print("Let's get some gelato.");
        } else if (temperature > 75) {
            System.out.print("That's quite warm.");
        } else if (temperature > 55) {
            System.out.print("Ah, a perfect day for a brisk walk!");
        } else if (temperature > 35) {
            System.out.print("Cool air is good for your health!");
        } else if (temperature > 20) {
            System.out.print("Rather chilly for my liking...");
        } else if (temperature > 0) {
            System.out.print("Ooh, it's cold out there!");
        } else {
            System.out.print("Yikes! Another ice age!");
        }
        double x = temperature / size;
    }
}