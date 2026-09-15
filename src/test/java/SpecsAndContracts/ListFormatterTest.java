package SpecsAndContracts;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListFormatterTest {

    @Test
    public void testSortInPlaceMutatesOriginal() {
        List<String> names = new java.util.ArrayList<>(Arrays.asList("Charlie", "Alice", "Bob"));
        ListFormatter.sortInPlace(names);
        assertEquals(Arrays.asList("Alice", "Bob", "Charlie"), names);
    }

    @Test
    public void testToLowerCaseDoesNotMutateOriginal() {
        List<String> original = new java.util.ArrayList<>(Arrays.asList("HELLO", "World"));
        List<String> copy = new java.util.ArrayList<>(original);

        List<String> lowered = ListFormatter.toLowerCase(original);

        assertEquals(copy, original);
        assertEquals(Arrays.asList("hello", "world"), lowered);
    }
}