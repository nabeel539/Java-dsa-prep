package funstions;

import java.util.Scanner;

public class Functions {

    // public static void printMyName(String name){
    //     System.out.println("Name is "+name);
    //     return;
    // }


    // Find Sum of 2 nos.
    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }

    // Find Products of 2 nos.
    public static int calculateProduct (int a , int b){
        int product = a * b;
        return product;
    }


    // Factorial of number
    public static void printFactorial(int n){

        if (n < 0) {
            System.out.println("INVALID NUMBER");
            return;
        }
        int fac = 1;
        // Loop 
        for(int i=n; i>=1; i--){
            fac = fac * i;
        }
        System.out.println("Factorial of number is : "+fac);
        return;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            printFactorial(n);
        }

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // int sum = calculateSum(a, b);
        // System.out.println("The Sum of 2 nos is "+sum);


        // int product = calculateProduct(a, b);
        // System.out.println("Product of 2 nos is "+product);



    }
}