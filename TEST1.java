import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TEST1 {

    @Test
    void main() {
        //Модульний тест для методу sum
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(0, Main.sum(array));
    }

    @Test
    void sum() {
        //Модульний тест для методу product
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(362880, Main.product(array));
    }
}