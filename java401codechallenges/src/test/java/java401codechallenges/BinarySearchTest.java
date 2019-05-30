package java401codechallenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test
    public void testEmptyArray() {
        int[] emptyArr = {};
        int target = 4;
        assertEquals("For empty array input, binarySearch method should return '-1'", -1, BinarySearch.binarySearch(emptyArr, target));
    }

    @Test
    public void testSingleElementArrayWithTarget() {
        int[] emptyArr = {4};
        int target = 4;
        assertEquals("For array of length 1, binarySearch method should return '0'", 0, BinarySearch.binarySearch(emptyArr, target));
    }

    @Test
    public void testSingleElementArrayWithNoTarget() {
        int[] emptyArr = {5};
        int target = 4;
        assertEquals("For array of length 1, binarySearch method should return '-1'", -1, BinarySearch.binarySearch(emptyArr, target));
    }

    @Test
    public void testArrayWithNoTarget() {
        int[] emptyArr = {2, 3, 5, 6, 7, 8, 9};
        int target = 4;
        assertEquals(" binarySearch method should return '-1'", -1, BinarySearch.binarySearch(emptyArr, target));
    }

    @Test
    public void testOddLengthArrayWithTarget() {
        int[] emptyArr = {2, 3, 5, 6, 7, 8, 9};
        int target = 6;
        assertEquals("binarySearch method should return '3'", 3, BinarySearch.binarySearch(emptyArr, target));
    }

    @Test
    public void testEvenLengthArrayWithTarget() {
        int[] emptyArr = {2, 3, 5, 6, 7, 8, 9, 10};
        int target = 6;
        assertEquals("binarySearch method should return '3'", 3, BinarySearch.binarySearch(emptyArr, target));
    }
}
