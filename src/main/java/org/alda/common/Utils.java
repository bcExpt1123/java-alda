package org.alda.common;

import java.util.Arrays;

public class Utils {
    /**
     * Join the elements of an int array into a single string using the specified delimiter.
     *
     * @param arr       the array of integers to join
     * @param delimiter the string placed between adjacent elements in the result
     * @return the array elements separated by the delimiter; an empty string if the array has no elements
     */
    public static String intArrToStr(int[] arr, String delimiter) {
        return Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .reduce((a, b) -> a + delimiter + b)
                .orElse("");
    }

    /**
     * Convert an integer array into a single string with elements separated by ", ".
     *
     * @param arr the integers to join
     * @return a string with the array elements separated by ", ", or an empty string if the array is empty
     */
    public static String intArrToStr(int[] arr) {
        return intArrToStr(arr, ", ");
    }
}
