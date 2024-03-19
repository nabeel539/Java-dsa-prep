import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // String Declaration
        String name = "Nabeel";
        String sentence = "My name is Mohammed Nabeel Ahemad";

        Scanner sc = new Scanner(System.in);
        String myName = sc.next();      // take input token of String(word).
        System.out.println("Your name is "+myName);
        String myName1 = sc.nextLine(); // take input complete line.

        // Concatenation
        String firstName = "Tony";
        String lastName = "Stack";
        String fullName = firstName +" "+ lastName;
        System.out.println(fullName);

        // Length
        System.out.println(fullName.length());

        // charAt
        for(int i=0; i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }

        // compare
        String name1 = "Tony";
        String name2 = "Tony";

        // s1 > s2 : +ve
        // s1 < s2 : -ve
        // s1 == s2 : 0

        // hello < wello (compairing 1st character)
        // aahello > aabello
        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equals");
        } else {
            System.out.println("Strings are not equals");
        }

        // sometimes == fails in some cases.


        // substring
        String sentence1 = "My name is Tony";
        // substring(startIdx, endIdx) - last idx non-inclusive
        String subsSentence = sentence1.substring(11, sentence1.length());
        String subsSentence1 = sentence1.substring(4); //ending - last idx
        System.out.println(subsSentence);
        System.out.println(subsSentence1);


        //! **Strings are Immutable
        sc.close();
    }
}
