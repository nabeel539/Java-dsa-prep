package arrays;

import java.util.Scanner;

public class SearchIndexInArr {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

                 // size
                 System.out.println("Enter size of array : ");
                 int size = sc.nextInt();
     
                 int numbers[] = new int[size];


            

                // input
                System.out.println("Enter values : ");
                for(int i =0; i<size ;i++){
                    numbers[i] = sc.nextInt();
                }

                System.out.println("enter number u want to search :");
                int x = sc.nextInt();

                // Output
                for(int i =0;i<size;i++){

                    if (numbers[i] == x) {
                        System.out.println("x is found at index "+i);
                    }
                   
                }
        }
    }
}
