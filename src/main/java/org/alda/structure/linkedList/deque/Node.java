package org.alda.structure.linkedList.deque;

import org.alda.common.Printable;

/**
 * @author bcExpt1123
 *
 * The {@code Node} class represents a single element in a doubly linked list.
 * Each node stores a piece of data, a reference to the next node, and a reference
 * to the previous node in the list.
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
     * The reference to the previous node in the list.
     */
    public Node<T> prev;

    /**
     * Constructs a new {@code Node} with the specified data. The {@code next} and
     * {@code prev} references are initialized to {@code null}.
     *
     * @param data The data to store in the node.
     */
    public Node(T data){
        this.data = data;
        next = null;
        prev = null;
    }

    /**
     * Constructs a new {@code Node} with {@code null} data. This is a default constructor
     * that calls the main constructor with {@code null} as the data.
     */
    public Node(){
        this(null);
    }

    /**
     * Prints this node's data, along with the data of adjacent nodes if available, to standard output.
     *
     * The output includes the node's data, and, if present, the data of the next and previous nodes in the format:
     * {@code Data: <data>, Next: <next data>, Prev: <previous data>}.
     */
    public void print(){
        System.out.print("\nData: " + data);
        if (next != null) {
            System.out.print(", Next: " + next.data);
        }
        if (prev != null) {
            System.out.print(", Prev: " + prev.data);
        }
    }
}
