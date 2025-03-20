public class zad3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        int temp = numbers[0];
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = temp;

        int sum = numbers[0] + numbers[numbers.length / 2];

        System.out.println("Сумма первого и среднего элемента: " + sum);
    }
}
