
public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println(array[i]);
            if (array[i] % 2 == 0) {
                sum += array[i];
                count++;
            }
        }
        System.out.println("Середній арифметичний індекс парних елементів масиву: " + (double) sum / count);
    }
}