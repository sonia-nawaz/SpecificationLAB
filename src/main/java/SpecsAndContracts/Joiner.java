/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SpecsAndContracts;

/**
 *
 * @author COMPUTER CORNER
 */


import java.util.List;

public class Joiner {

    /**
     * BAD - Operational spec.
     * Loops through the "words" list starting at index 0. For each word except
     * the last one, appends the word followed by the "delimiter" string to a
     * StringBuilder. For the final word (at index words.size() - 1), appends
     * only the word itself without a trailing delimiter, using an if-statement
     * to check whether the current index equals words.size() - 1. Finally
     * converts the StringBuilder to a String using toString() and returns it.
     */
    public static String joinStringsOperational(List<String> words, String delimiter) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            sb.append(words.get(i));
            if (i != words.size() - 1) {
                sb.append(delimiter);
            }
        }
        return sb.toString();
    }

    /**
     * GOOD - Declarative spec.
     * Returns the concatenation of the elements of words, in order, with
     * delimiter inserted between each adjacent pair. Returns the empty
     * string if words is empty.
     *
     * @param words     the list of strings to join. Requires words != null.
     * @param delimiter the separator placed between adjacent words. Requires delimiter != null.
     * @return the joined string
     */
    public static String joinStringsDeclarative(List<String> words, String delimiter) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            sb.append(words.get(i));
            if (i != words.size() - 1) {
                sb.append(delimiter);
            }
        }
        return sb.toString();
    }
}