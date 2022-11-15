import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 201) - 100;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Сума від'ємних елементів: " + sum(array));
        System.out.println("Добуток елементів, розтащованих між мінімальним та максимальним елементами: " + product(array));
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static int product(int[] array) {
        int product = 1;
        int min = array[0];
        int max = array[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        if (minIndex > maxIndex) {
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }
        for (int i = minIndex + 1; i < maxIndex; i++) {
            product *= array[i];
        }
        return product;
    }
}
