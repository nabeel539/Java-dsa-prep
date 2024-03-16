// Take an array of numbers as input and check if it is an array sorted in ascending order.
// Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//      {3, 4, 6, 2} is not sorted in ascending order.

import java.util.*;
public class CheckingOrderOfArray {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){
            
            System.out.println("Enter Size: ");
            int size = sc.nextInt();

            // creating an array 
            int number[] = new int[size];


            System.out.println("Enter Elements : ");
            for(int i=0; i<size; i++){
                number[i] = sc.nextInt();
            }

            boolean isAccending = true;
            for(int i=0; i<number.length-1; i++){

                if (number[i]> number[i+1]) {
                    isAccending = false;
                }
            }

            if (isAccending) {
                System.out.println("The array is in Ascending Order...");
            } else {
                System.out.println(" Array is not in Ascending order...");
            }


        }
    }
}
