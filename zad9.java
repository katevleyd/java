import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        double[] array = new double[size];

        System.out.println("Введите элементы массива:");
        double sum = 0;
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
            sum += array[i];
        }

        double average = sum / size;

        System.out.println("Результат:");
        for (double num : array) {
            System.out.println(num * average);
        }

        scanner.close();
    }
}
