package funstions;

import java.util.Scanner;

public class NumbersGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        char choice;

        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Count positive, negative, and zero numbers
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        // Display the count of positive, negative, and zero numbers
        System.out.println("Count of Positive Numbers: " + positiveCount);
        System.out.println("Count of Negative Numbers: " + negativeCount);
        System.out.println("Count of Zero Numbers: " + zeroCount);

        scanner.close();
    }
}
