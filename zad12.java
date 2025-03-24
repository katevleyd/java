import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: I like Java!!!: ");
        String str = scanner.nextLine();

        boolean containsJava = str.contains("Java");

        boolean startsWithILike = str.startsWith("I like");

        boolean endsWithExclamationMarks = str.endsWith("!!!");

        if (containsJava && startsWithILike && endsWithExclamationMarks) {
            System.out.println(str.toUpperCase());
        }

        String replacedStr = str.replace('a', 'o');
        int startIndex = replacedStr.indexOf("Jovo");
        if (startIndex != -1) {
            System.out.println(replacedStr.substring(startIndex, startIndex + 4));
        }
    }
}
