import java.util.Scanner;

public class StringsHW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input gmail
        System.out.println("Enter your gmail :");

        String gmail = sc.nextLine();
        System.out.println(gmail);

        String username = "";

        for (int i = 0; i < gmail.length(); i++) {
            if (gmail.charAt(i) == '@') {
                break;
            } else {
                username += gmail.charAt(i);
            }
        }
        System.out.println(username);

        sc.close();
    }
}
