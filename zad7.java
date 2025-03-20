import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {

        final int x = 50;
        final int y = 100;
        final int z = 200;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        boolean found = false;
        for (int num : array) {
            if (num == x || num == y || num == z) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Данное значение имеется в константах");
        }

        scanner.close();
    }
}
