
// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
import java.util.Scanner;

public class StringsHW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int size = sc.nextInt();

        String arr[] = new String[size];
        int length = 0;

        System.out.println("Enter string");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.next();
            length += arr[i].length();

        }

        System.out.println("Cumulative length of all strings:" + length);

        sc.close();

    }
}

// Output:
// Enter the Size : 3
// Enter string :
// Hello
// World
// Java

// Cumulative length of all strings: 13
