import java.util.Scanner;

public class zad13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку из слов, разделенных пробелами:");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+");

        int count = 0;
        System.out.println("Слова, состоящие только из латиницы:");
        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) {
                System.out.println(word);
                count++;
            }
        }

        System.out.println("Количество слов, состоящих только из латиницы: " + count);

        scanner.close();
    }
}
