import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double x = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double y = scanner.nextDouble();

        System.out.print("Введите третье число: ");
        double z = scanner.nextDouble();

        double average = (x + y + z) / 3;
        System.out.println("Среднее арифметическое: " + average);

        int result = (int) Math.floor(average / 2);
        System.out.println("Результат деления и округления: " + result);

        if (result > 3) {
            System.out.println("Программа выполнена корректно");
        }

        scanner.close();
    }
}
