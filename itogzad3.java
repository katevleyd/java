import java.util.HashSet;
import java.util.Scanner;

public class itogzad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Количество строк: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String maxUniqueStr = "";
        int maxUniqueCount = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Строка " + i + ": ");
            String currentStr = scanner.nextLine();

            int uniqueCount = countUniqueChars(currentStr);

            if (uniqueCount > maxUniqueCount) {
                maxUniqueCount = uniqueCount;
                maxUniqueStr = currentStr;
            }
        }

        System.out.println("Ответ: " + maxUniqueStr);

        scanner.close();
    }

    private static int countUniqueChars(String str) {
        HashSet<Character> uniqueChars = new HashSet<>();
        for (char c : str.toCharArray()) {
            uniqueChars.add(c);
        }
        return uniqueChars.size();
    }
}
