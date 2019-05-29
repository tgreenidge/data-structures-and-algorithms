package java401codechallenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {
    @Test
    public void testRollEvenArrayLength() {
        int[] inputArray1 = {1, 4};
        int valueToInsert = 3;
        int[] outputArray1 = {1, 3, 4};

        assertArrayEquals("insertShiftArray method should return {{1, 3, 4}", outputArray1, ArrayShift.insertShiftArray(inputArray1, valueToInsert));
    }

    @Test
    public void testRollOddArrayLength() {
        int[] inputArray2 = {1, 4, 2};
        int valueToInsert = 3;

        int[] outputArray2 = {1, 4, 3, 2};

        assertArrayEquals("insertShiftArray method should return {{1, 4, 3, 2}", outputArray2, ArrayShift.insertShiftArray(inputArray2, valueToInsert));

    }
}
