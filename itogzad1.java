import java.util.Scanner;

public class itogzad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Курс доллара: ");
        double exchangeRate = scanner.nextDouble();

        System.out.print("Количество рублей: ");
        double rubles = scanner.nextDouble();

        double dollars = rubles / exchangeRate;

        System.out.printf("Итого: %.2f долларов%n", dollars);

        scanner.close();
    }
}
