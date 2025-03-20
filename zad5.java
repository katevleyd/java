import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Введите операцию ('+', '-', '*' или '/'): ");
        char operation = scanner.next().charAt(0);

        double result;
        boolean validOperation = true;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Делить на ноль нельзя!");
                    validOperation = false;
                    result = 0;
                }
                break;
            default:
                System.out.println("Неверная операция!");
                validOperation = false;
                result = 0;
        }

        if (validOperation) {
            System.out.println("Результат: " + result);
        }

        scanner.close();
    }
}
