import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
            int rows = sc.nextInt();
            int cols = sc.nextInt();

            int [][] numbers = new int[rows][cols];

            //input
                //rows
            for(int i = 0; i<rows; i++){
                // cols
                for(int j=0; j<cols; j++){
                    numbers[i][j] = sc.nextInt();
                }
            }

            int x = sc.nextInt();

            // Output
            for(int i = 0; i<rows; i++){
                for(int j =0; j<cols; j++){

                    if (numbers[i][j]== x) {
                        System.out.println("x is found at index ["+i+","+j+"]");
                    }
                   
                }
            }
        }
    }
}
