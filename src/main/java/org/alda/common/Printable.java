package org.alda.common;

/**
 * @author bcExpt1123
 *
 * The {@code Printable} interface should be implemented by any class whose instances are intended to provide
 * a printable representation of themselves.
 *
 * <p>Classes implementing this interface must provide an implementation for the {@code print} method,
 * which is intended to output or display the object's content in a human-readable format.</p>
 *
 * <p>Example usage:</p>
 * <pre>
 * public class Document implements Printable {
 *     @override
 *     public void print() {
 *         System.out.println("Printing document content...");
 *     }
 * }
 * Printable doc = new Document();
 * doc.print();
 * </pre>
 *
 */
public interface Printable {
    void print();
}
