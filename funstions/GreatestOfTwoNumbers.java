// Write a function which takes in 2 numbers and returns the greater of those two.
package funstions;

import java.util.Scanner;

public class GreatestOfTwoNumbers {

    public static void findGreatest(int a, int b){

        if(a < b){
            System.out.println(b+" is greatest...");
        } else{
            System.out.println(a+" is greatest...");
        }
    }

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            findGreatest(a, b);
        }

    }
}
