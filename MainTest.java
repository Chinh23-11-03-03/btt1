import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testPositiveIntegerInput() {
        int n = 5;
        int expectedSum = 15;

        int actualSum = Main.calculateSumOfPositiveIntegers(n);//

        assertEquals(expectedSum, actualSum);
    }


    @Test
    public void testIsEvenSumForEvenNumber() {
    int sum = 8; // Số chẵn
    assertTrue(Main.isEvenSum(sum), "Even number should return true");
    }

    @Test
    public void testOddSum() {
        int n = 9;

        boolean isOddSum = Main.isOddSum(Main.calculateSumOfPositiveIntegers(n));

        assertTrue(isOddSum);
    }
}
