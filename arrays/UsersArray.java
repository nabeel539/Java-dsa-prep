// Take input from user & print them on Screen.

import java.util.*;
public class UsersArray {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Size Of your Array : ");

            int size = sc.nextInt();

            String names[] = new String[size];

            //taking input from user

            System.out.println("Enter your elements : ");
            for(int i=0; i<size; i++){
                names[i] = sc.next();
            }


            // Output 
            System.out.println("Output array is......");
            for(int i =0; i<names.length; i++){
                System.out.println(names[i]);
            }


        }
        

        
    }
}
