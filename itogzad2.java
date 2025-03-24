import java.util.Scanner;

public class itogzad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите уравнение (например, x+5=7): ");
        String equation = scanner.nextLine();

        if (equation.length() != 5 || equation.charAt(1) != '+' && equation.charAt(1) != '-' || equation.charAt(3) != '=') {
            System.out.println("Некорректный формат уравнения!");
            return;
        }

        char operation = equation.charAt(1);
        int result = Character.getNumericValue(equation.charAt(4));

        int a, b;
        int x = 0;

        if (equation.charAt(0) == 'x') {
            b = Character.getNumericValue(equation.charAt(2));
            x = (operation == '+') ? result - b : result + b;
        } else if (equation.charAt(2) == 'x') {
            a = Character.getNumericValue(equation.charAt(0));
            x = (operation == '+') ? result - a : a - result;
        } else if (equation.charAt(4) == 'x') {
            a = Character.getNumericValue(equation.charAt(0));
            b = Character.getNumericValue(equation.charAt(2));
            x = (operation == '+') ? a + b : a - b;
        }

        System.out.println("Значение x: " + x);

        scanner.close();
    }
}
