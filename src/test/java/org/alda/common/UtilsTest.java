package org.alda.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilsTest {
    @Test
    void testNormalArray() {
        int[] arr = {1, 2, 3, 4, 5};
        String result = Utils.intArrToStr(arr, ",");
        assertEquals("1,2,3,4,5", result);
    }

    @Test
    void testSingleElementArray() {
        int[] arr = {42};
        String result = Utils.intArrToStr(arr, ",");
        assertEquals("42", result);
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        String result = Utils.intArrToStr(arr, ",");
        assertEquals("", result);
    }

    @Test
    void testDifferentDelimiter() {
        int[] arr = {10, 20, 30};
        String result = Utils.intArrToStr(arr, " | ");
        assertEquals("10 | 20 | 30", result);
    }

    @Test
    void testNegativeNumbers() {
        int[] arr = {-1, -2, -3};
        String result = Utils.intArrToStr(arr, ";");
        assertEquals("-1;-2;-3", result);
    }
}
