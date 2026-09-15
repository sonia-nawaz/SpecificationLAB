package SpecsAndContracts;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SearchStrategiesTest {

    @Test
    public void testDifferentResults_duplicates() {
        int[] arr = {5, 2, 5, 8, 5};
        int first = SearchStrategies.findFirst(arr, 5);
        int last = SearchStrategies.findLast(arr, 5);
        assertEquals(0, first);
        assertEquals(4, last);
        assertNotEquals(first, last);
    }

    @Test
    public void testDifferentResults_missingValue() {
        int[] arr = {1, 2, 3};
        int first = SearchStrategies.findFirst(arr, 99);
        int last = SearchStrategies.findLast(arr, 99);
        assertEquals(arr.length, first);
        assertEquals(-1, last);
        assertNotEquals(first, last);
    }

    @Test
    public void testSameResult_singleOccurrence() {
        int[] arr = {10, 20, 30, 40};
        int first = SearchStrategies.findFirst(arr, 30);
        int last = SearchStrategies.findLast(arr, 30);
        assertEquals(2, first);
        assertEquals(2, last);
        assertEquals(first, last);
    }
}