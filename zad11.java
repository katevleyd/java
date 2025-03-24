import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        String strNum = scanner.nextLine();

        System.out.print("Введите второе число: ");
        int intNum = scanner.nextInt();

        int firstNum = Integer.parseInt(strNum);

        int max = Math.max(firstNum, intNum);
        int min = Math.min(firstNum, intNum);

        System.out.println("Большее число: " + max);
        System.out.println("Меньшее число (в формате double): " + (double) min);

        scanner.close();
    }
}
