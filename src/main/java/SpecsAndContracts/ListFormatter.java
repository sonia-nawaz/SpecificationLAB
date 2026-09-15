package SpecsAndContracts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListFormatter {

    /**
     * Sorts lst in place, in natural order. MUTATES the list passed in.
     */
    public static void sortInPlace(List<String> lst) {
        Collections.sort(lst);
    }

    /**
     * Returns a NEW list with lowercase versions of every string in lst.
     * Does not mutate lst.
     */
    public static List<String> toLowerCase(List<String> lst) {
        List<String> result = new ArrayList<>();
        for (String s : lst) {
            result.add(s.toLowerCase());
        }
        return result;
    }
}