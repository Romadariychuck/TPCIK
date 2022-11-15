import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

//Модульний тест класу Main
public class TEST2 {
    @Test
    public void testMain() {
        int[] array = {2, 3, 4, 5, 6};
        int sum = 0;
        int count = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                sum += j;
                count++;
            }
        }
        assertEquals(4, (double) sum / count, 0.01);
    }
}
