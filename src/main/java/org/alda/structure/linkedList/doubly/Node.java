package org.alda.structure.linkedList.doubly;

import org.alda.common.Printable;

/**
 * @author bcExpt1123
 *
 * The {@code Node} class represents a single element in a doubly linked list.
 * Each node stores a piece of data, a reference to the next node, and a reference to the previous node.
 *
 * <p>This class also implements the {@link Printable} interface, allowing the node's content
 * to be printed in a human-readable format.</p>
 *
 * @param <T> The type of data stored in the node.
 *
 */
public class Node<T> implements Printable {

    /**
     * The data stored in this node.
     */
    public T data;

    /**
     * The reference to the next node in the list.
     */
    public Node<T> next;

    /**
     * The reference to the previous node in the list.
     */
    public Node<T> prev;

    /**
     * Constructs a new {@code Node} with the specified data.
     * The {@code next} and {@code prev} references are initialized to {@code null}.
     *
     * @param data The data to store in the node.
     */
    public Node(final T data) {
        this.data = data;
        next = null;
        prev = null;
    }

    /**
     * Prints the data stored in this node, as well as the data in the next and previous nodes, if available.
     * The output format is: {@code Data: <data>, Next: <next data>, Prev: <prev data>}
     */
    public void print() {
        System.out.print("Data: " + data);
        if (next != null) {
            System.out.print(", Next: " + next.data);
        }
        if (prev != null) {
            System.out.print(", Prev: " + prev.data);
        }
    }
}
