package java401codechallenges;

import org.junit.Test;

import java401codechallenges.Sorts;
import static org.junit.Assert.*;

public class SortsTest {

    @Test
    public void testInsertionSortWithEmptyArr(){
        Sorts sorts = new Sorts();
        int[] empty = {};

        assertArrayEquals("Return array should be empty", empty , Sorts.insertionSort(empty));
    }

    @Test
    public void testInsertionSortWithSingleValueArr(){
        Sorts sorts = new Sorts();
        int[] arr = {1};

        assertArrayEquals("Return array should be the same", arr , Sorts.insertionSort(arr));
    }

    @Test
    public void testInsertionSortWithMultipleValues(){
        Sorts sorts = new Sorts();
        int[] arr = {1, 5, 0, -1, 3, 9, 2, 12, 10, -2};
        int[] sorted = {-2, -1, 0, 1, 2, 3, 5, 9, 10, 12};

        assertArrayEquals("Return array should be the same", sorted , Sorts.insertionSort(arr));
    }

}
