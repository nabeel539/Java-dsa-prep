package funstions;

import java.util.Scanner;

public class PrintAllOdds {

    public static void printOdds(int n){

        int sum = 0;
        for(int i=1; i<=n; i++){
            // find odds
            if (i%2 != 0) {
               sum = sum +i;
            } 
        }

        System.out.println("Sum of all odds : "+sum);
    }
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            printOdds(n);
        }

        
        
    }
}
