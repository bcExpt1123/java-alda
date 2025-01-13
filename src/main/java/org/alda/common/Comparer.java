package org.alda.common;

public class Comparer {
    public static <T> Integer compare(T a, T b) {
        if (a instanceof String && b instanceof String) {
            // Compare as Strings
            return ((String) a).compareTo((String) b);
        } else if (a instanceof Number && b instanceof Number) {
            // Compare as Numbers
            double numA = ((Number) a).doubleValue();
            double numB = ((Number) b).doubleValue();
            if (numA >= numB) {
                return 1;
            } else if (numA < numB) {
                return -1;
            }
            return 0;
        } else {
            throw new IllegalArgumentException("Both arguments must be either Strings or Numbers.");
        }
    }
}
