import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int category = scanner.nextInt();

        if (category == 1) {
            convertMass(scanner);
        } else if (category == 2) {
            convertDistance(scanner);
        } else {
            System.out.println("Такой категории нет!");
        }
        scanner.close();
    }

    private static void convertMass(Scanner scanner) {
        System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - унция");
        int unit = scanner.nextInt();

        System.out.println("Введите число:");
        double value = scanner.nextDouble();

        System.out.println("Результат:");
        switch (unit) {
            case 1: // Килограммы
                System.out.println("Килограммы: " + value);
                System.out.printf("Фунты: %.2f%n", value * 2.20462);
                System.out.printf("Унции: %.2f%n", value * 35.274);
                break;
            case 2: // Фунты
                System.out.printf("Килограммы: %.2f%n", value / 2.20462);
                System.out.println("Фунты: " + value);
                System.out.printf("Унции: %.2f%n", value * 16);
                break;
            case 3: // Унции
                System.out.printf("Килограммы: %.2f%n", value / 35.274);
                System.out.printf("Фунты: %.2f%n", value / 16);
                System.out.println("Унции: " + value);
                break;
            default:
                System.out.println("Введена неверная единица измерения!");
        }
    }

    private static void convertDistance(Scanner scanner) {
        System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
        int unit = scanner.nextInt();

        System.out.println("Введите число:");
        double value = scanner.nextDouble();

        System.out.println("Результат:");
        switch (unit) {
            case 1: // Метры
                System.out.println("Метры: " + value);
                System.out.printf("Мили: %.3f%n", value * 0.000621371);
                System.out.printf("Ярды: %.2f%n", value * 1.09361);
                System.out.printf("Футы: %.2f%n", value * 3.28084);
                break;
            case 2: // Мили
                System.out.printf("Метры: %.2f%n", value / 0.000621371);
                System.out.println("Мили: " + value);
                System.out.printf("Ярды: %.2f%n", value * 1760);
                System.out.printf("Футы: %.2f%n", value * 5280);
                break;
            case 3: // Ярды
                System.out.printf("Метры: %.2f%n", value / 1.09361);
                System.out.printf("Мили: %.3f%n", value / 1760);
                System.out.println("Ярды: " + value);
                System.out.printf("Футы: %.2f%n", value * 3);
                break;
            case 4: // Футы
                System.out.printf("Метры: %.2f%n", value / 3.28084);
                System.out.printf("Мили: %.3f%n", value / 5280);
                System.out.printf("Ярды: %.2f%n", value / 3);
                System.out.println("Футы: " + value);
                break;
            default:
                System.out.println("Введена неверная единица измерения!");
        }
    }
}
