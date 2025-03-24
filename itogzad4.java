import java.util.Scanner;

public class itogzad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String correctAnswer = "Заархивированный вирус";
        boolean hintUsed = false;

        System.out.println("Загадка: \"Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает\".");

        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.print("Введите ваш ответ: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Правильно!");
                return;
            }

            if (userAnswer.equalsIgnoreCase("Подсказка")) {
                if (attempt == 1) {
                    System.out.println("Подсказка: Его можно разархивировать, но это опасно.");
                    hintUsed = true;
                    continue;
                } else {
                    System.out.println("Подсказка уже недоступна.");
                }
            } else {
                if (attempt == 3 || hintUsed) {
                    System.out.println("Обидно, приходи в другой раз.");
                    return;
                } else {
                    System.out.println("Подумай еще!");
                }
            }
        }

        scanner.close();
    }
}
