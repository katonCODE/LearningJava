package MoreDSA;

import java.util.Scanner;

public class NumberGuesser {

    public static String guessNumber(int lower_bound, int upper_bound) {

        Scanner scan = new Scanner(System.in);
        String input = "";
        System.out.println("Number guesser input y for correct, l for lower, and h for higher");

        while (lower_bound < upper_bound) {
            int guess = ((upper_bound + lower_bound) / 2);

            String guessing = "is your number: " + guess + " l for lower, h for higher";

            System.out.println(guessing);
            input = scan.nextLine();

            if (input.equals("y")) {
                System.out.println("your number is: " + guess);
                return "";

            } else if (input.equals("l")) {
                upper_bound = guess;
            } else if (input.equals("h")) {

                lower_bound = guess;
            } else {
                return "didn't enter a proper input";
            }

        }

        return "";

    }

    public static void main(String[] args) {
        System.out.println("think of a number between 0 and 100");
        guessNumber(0, 100);

    }
}
