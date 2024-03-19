public class StringsHW {
    public static void main(String[] args) {
        String str ="123";
        int number = Integer.parseInt(str);
        System.out.println(number); // 123

        String str1 = Integer.toString(number);
        System.out.println(str1.length()); // 3
    }
}
