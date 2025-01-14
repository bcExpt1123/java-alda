package org.alda.structure.linkedList.circular;

import org.alda.common.Printable;

/**
 * @author bcExpt1123
 *
 * The {@code Node} class represents a single element in a linked list structure.
 * Each node stores a piece of data and a reference to the next node in the list.
 *
 * <p>This class is generic, allowing nodes to store data of any type.</p>
 *
 * <p>The {@code Node} class also implements the {@link Printable} interface,
 * providing a {@code print} method to display the node's content in a human-readable format.</p>
 *
 * <p>Example usage:</p>
 * <pre>
 * Node<Integer> node1 = new Node<>(10);
 * Node<Integer> node2 = new Node<>(20);
 * node1.next = node2;
 *
 * node1.print(); // Output: Data: 10, Next: 20
 * </pre>
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
     * The reference to the next node in the linked list.
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
        this.next = null;
    }

    /**
     * Prints the data stored in this node and, if present, the data in the next node.
     * The output format is: {@code Data: <data>, Next: <next data>}
     */
    public void print() {
        System.out.print("Data: " + data);
        if (next != null) {
            System.out.print(", Next: " + next.data);
        }
    }
}
