package funstions;
// Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.Scanner;

public class FindCircumferenceOfCircle {

    public static void findCircumference(int r){
        double cur = 2 * 3.14 * r;
        System.out.println("Circumference of Circle is "+cur);
    }
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the radius of Circle :");
            int r = sc.nextInt();

            findCircumference(r);
        }
    }
}
