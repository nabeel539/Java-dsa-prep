package funstions;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            // 0 1 1 2 3 5 8 13 21
            int a = 0 ; int b = 1;

            System.out.println("Enter the nth term : ");
            int n = sc.nextInt(); 

            System.out.print(a+" ");

            if (n > 1) {
                // find the nth term
                for(int i=2 ; i<=n; i++){
                    System.out.print(b+" ");

                    // Swapping
                    int temp = b;
                    b = a + b;
                    a = temp;
                }

                System.out.println();
            }
        }
    }
}
