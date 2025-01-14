package org.alda.common;

/**
 * @author bcExpt1123
 *
 * The {@code Comparer} class provides a utility method to compare two objects of type {@code T}.
 * The objects must be either {@link String} or {@link Number}.
 *
 * <p>The comparison behavior is as follows:</p>
 * <ul>
 *   <li>If both objects are {@link String}, they are compared lexicographically.</li>
 *   <li>If both objects are {@link Number}, they are compared based on their numerical values.</li>
 * </ul>
 *
 * <p>Example usage:</p>
 * <pre>
 * int result1 = Comparer.compare("apple", "banana"); // Returns negative value
 * int result2 = Comparer.compare(42, 27);            // Returns positive value
 * int result3 = Comparer.compare(3.14, 3.14);        // Returns 0
 * </pre>
 *
 * <p>Note: If the two objects are not of the same type (both {@code String} or both {@code Number}),
 * the method throws an {@link IllegalArgumentException}.</p>
 *
 * @param <T> The type of objects to be compared. Must be either {@link String} or {@link Number}.
 * @throws IllegalArgumentException if the objects are not both {@link String} or both {@link Number}.
 */
public class Comparer {

    /**
     * Compares two objects of type {@code T}.
     *
     * <p>The comparison logic is as follows:</p>
     * <ul>
     *   <li>If both objects are {@link String}, they are compared using {@link String#compareTo(String)}.</li>
     *   <li>If both objects are {@link Number}, they are compared numerically.</li>
     * </ul>
     *
     * @param <T> The type of the objects to be compared. Must be either {@link String} or {@link Number}.
     * @param a The first object to compare.
     * @param b The second object to compare.
     * @return A positive integer if {@code a > b}, a negative integer if {@code a < b}, or 0 if {@code a == b}.
     * @throws IllegalArgumentException if the objects are not both {@link String} or both {@link Number}.
     */
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
