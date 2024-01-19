package funstions;

import java.util.Scanner;

public class PowerOfX {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter X value : ");
            int x = sc.nextInt();

            System.out.println("Enter N value : ");
            int n = sc.nextInt();
            
            
            // X^n = X * X * X .....n times
            int xPowN = 1;
            for(int i=1;i<=n;i++){
                xPowN = xPowN * x;
            } 
            System.out.println("result : "+xPowN); 
        }
    }
}
