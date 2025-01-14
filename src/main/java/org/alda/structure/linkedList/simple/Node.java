package org.alda.structure.linkedList.simple;

import org.alda.common.Printable;

/**
 * @author bcExpt1123
 *
 * The {@code Node} class represents a single element in a singly linked list.
 * Each node stores a piece of data and a reference to the next node in the list.
 *
 * <p>This class implements the {@link Printable} interface, providing a method to display
 * the node's content in a human-readable format.</p>
 *
 * @param <T> The type of data stored in the node.
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
     * Constructs a new {@code Node} with the specified data.
     * The {@code next} reference is initialized to {@code null}.
     *
     * @param data The data to store in the node.
     */
    public Node(T data) {
        this.data = data;
        next = null;
    }

    /**
     * Prints the data stored in this node and, if present, the data in the next node.
     * The output format is: {@code Data: <data>, Next: <next data>}
     */
    public void print() {
        System.out.print("Data: " + data);
        if(next != null) {
            System.out.print(", Next: " + next.data);
        }
    }
}
