package arrays;
import java.util.*;


public class Arrays {

    public static void main(String[] args) {
        // int[] marks = new int[3];
        // marks[0] = 82;
        // marks[1] = 92;
        // marks[2] = 32;

        try (Scanner sc = new Scanner(System.in)) {
            // size
            System.out.println("Enter size of array : ");
            int size = sc.nextInt();

            int numbers[] = new int[size];

            // input
            System.out.println("Enter values : ");
            for(int i =0; i<size ;i++){
                numbers[i] = sc.nextInt();
            }

            // Output
            for(int i =0;i<size;i++){
                System.out.println(numbers[i]);
            }
        }
        
    }

    
}