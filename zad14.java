import java.util.Random;

public class zad14 {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(41) - 20;
        }

        System.out.print("Массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Нахождение минимального и максимального значений
        int min = array[0], max = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);

        int maxAbsValue = Math.abs(min) > Math.abs(max) ? min : max;
        System.out.println("Число с наибольшим модулем: " + maxAbsValue);
    }
}
