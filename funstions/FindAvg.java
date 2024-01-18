package funstions;

import java.util.Scanner;

public class FindAvg {


    public static int calculateAvg(int a, int b , int c){
        int sum = a + b + c;
        int avg = sum/3;
        return avg;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

           int avg = calculateAvg(a, b, c);
           System.out.println("Avg of 3nos is "+avg);
        }
    }
}
