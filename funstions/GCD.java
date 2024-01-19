package funstions;

import java.util.Scanner;

// Write a function that calculates the Greatest Common Divisor of 2 numbers.
public class GCD {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter 1st value :");
            int n1 = sc.nextInt();
            System.out.println("Enter 2nd value :");
            int n2 = sc.nextInt();

            while (n1 != n2) {
                if (n1 > n2) {
                    n1 = n1-n2;
                } else {
                    n2 = n2-n1;
                }
            }
            System.out.println("GCD is "+ n2);
        }
    }
}
