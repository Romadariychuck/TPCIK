
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TEST3 {
    @Test
    void main() {
        //Завдання 1. Тест
        double r = 3;
        double h = 10;
        double s = 2 * Math.PI * r * h;
        double v = Math.PI * r * r * h;
        assertEquals(s, 188.49555921538757);
        assertEquals(v, 282.7433388230814);
    }
    //Завдання 2. Тест
    @Test
    void main2() {
        int index = 60000;
        String city = "Київ";
        assertEquals(index, 60000);
        assertEquals(city, "Київ");

        int index2 = 59000;
        String city2 = "Львів";
        assertEquals(index2, 59000);
        assertEquals(city2, "Львів");

        int index3 = 57000;
        String city3 = "Харків";
        assertEquals(index3, 57000);
        assertEquals(city3, "Харків");

        int index4 = 58000;
        String city4 = "Одеса";
        assertEquals(index4, 58000);
        assertEquals(city4, "Одеса");

        int index5 = 56000;
        String city5 = "Дніпро";
        assertEquals(index5, 56000);
        assertEquals(city5, "Дніпро");

        int index6 = 54000;
        String city6 = "Запоріжжя";
        assertEquals(index6, 54000);
        assertEquals(city6, "Запоріжжя");

        int index7 = 52000;
        String city7 = "Вінниця";
        assertEquals(index7, 52000);
        assertEquals(city7, "Вінниця");

        int index8 = 55000;
        String city8 = "Донецьк";
        assertEquals(index8, 55000);
        assertEquals(city8, "Донецьк");

        int index9 = 51000;
        String city9 = "Кропивницький";
        assertEquals(index9, 51000);
        assertEquals(city9, "Кропивницький");

        int index10 = 53000;
        String city10 = "Житомир";
        assertEquals(index10, 53000);
        assertEquals(city10, "Житомир");
    }
}
