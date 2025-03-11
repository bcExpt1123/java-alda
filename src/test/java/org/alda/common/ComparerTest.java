package org.alda.common;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for {@link Comparer} class.
 */
class ComparerTest {

    @Test
    void testCompareStrings_LexicographicalOrder() {
        assertTrue(Comparer.compare("apple", "banana") < 0);
        assertTrue(Comparer.compare("banana", "apple") > 0);
        assertEquals(0, Comparer.compare("cherry", "cherry"));
    }

    @Test
    void testCompareNumbers_NumericalOrder() {
        System.out.println(Comparer.compare(100, 100));
        assertTrue(Comparer.compare(10, 5) > 0);
        assertTrue(Comparer.compare(3.14, 4.2) < 0);
        assertEquals(0, Comparer.compare(100, 100));
    }

    @Test
    void testCompareMixedNumberTypes() {
        assertTrue(Comparer.compare(42, 27.5) > 0);
        assertTrue(Comparer.compare(3.14, 3) > 0);
        assertTrue(Comparer.compare(2.5f, 3.5) < 0);
    }

    @Test
    void testCompareWithInvalidTypes() {
        Exception exception1 = assertThrows(IllegalArgumentException.class, () ->
                Comparer.compare("apple", 42)
        );
        assertEquals("Both arguments must be either Strings or Numbers.", exception1.getMessage());

        Exception exception2 = assertThrows(IllegalArgumentException.class, () ->
                Comparer.compare(42, "apple")
        );
        assertEquals("Both arguments must be either Strings or Numbers.", exception2.getMessage());
    }

    @Test
    void testCompareWithNullValues() {
        Exception exception1 = assertThrows(NullPointerException.class, () ->
                Comparer.compare(null, "banana")
        );
        Exception exception2 = assertThrows(NullPointerException.class, () ->
                Comparer.compare(42, null)
        );
        Exception exception3 = assertThrows(NullPointerException.class, () ->
                Comparer.compare(null, null)
        );
    }
}
