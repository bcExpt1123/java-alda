package org.alda.common;

import java.util.Arrays;

public class Utils {
    public static String intArrToStr(int[] arr, String delimiter) {
        return Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .reduce((a, b) -> a + delimiter + b)
                .orElse("");
    }

    public static String intArrToStr(int[] arr) {
        return intArrToStr(arr, ", ");
    }
}
