/*
 * 
 * 
 * 
 * A =  | 1  2  3 |
        | 4  5  6 |

 A^T = | 1  4 |
       | 2  5 |
       | 3  6 |


 */
import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input matrix dimensions
            System.out.println("Enter the number of rows:");
            int rows = sc.nextInt();
            System.out.println("Enter the number of columns:");
            int cols = sc.nextInt();
            
            // Input matrix elements
            int[][] matrix = new int[rows][cols];
            System.out.println("Enter the elements of the matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            
            // Transpose the matrix
            int[][] transposeMatrix = new int[cols][rows];
            for (int i = 0; i < cols; i++) {
                for (int j = 0; j < rows; j++) {
                    transposeMatrix[i][j] = matrix[j][i];
                }
            }
            
            // Output the transpose matrix
            System.out.println("Transpose of the matrix:");
            for (int i = 0; i < cols; i++) {
                for (int j = 0; j < rows; j++) {
                    System.out.print(transposeMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        
        // sc.close();
    }
    
}
