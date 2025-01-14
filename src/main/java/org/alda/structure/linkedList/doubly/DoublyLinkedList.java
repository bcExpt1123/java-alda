package org.alda.structure.linkedList.doubly;

import org.alda.common.Printable;

/**
 * @author bcExpt1123
 *
 * The {@code DoublyLinkedList} class represents a generic doubly linked list.
 * Each node in the list has references to both the next and previous nodes,
 * allowing traversal in both directions.
 *
 * <p>This class provides functionality to append, prepend, and print the list's contents.</p>
 *
 * <p>Example usage:</p>
 * <pre>
 * DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
 * list.append(10);
 * list.append(20);
 * list.prepend(5);
 * list.print();
 * </pre>
 *
 * @param <T> The type of data stored in the list's nodes.
 */
public class DoublyLinkedList<T> implements Printable {

    /**
     * The head (first node) of the doubly linked list.
     */
    public Node<T> head;

    /**
     * The tail (last node) of the doubly linked list.
     */
    public Node<T> tail;

    /**
     * Constructs an empty {@code DoublyLinkedList}.
     * The {@code head} and {@code tail} are initialized to {@code null}.
     */
    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    /**
     * Appends a new node containing the specified data to the end of the list.
     *
     * @param data The data to store in the new node.
     */
    public void append(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    /**
     * Prepends a new node containing the specified data to the beginning of the list.
     *
     * @param data The data to store in the new node.
     */
    public void prepend(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    /**
     * Prints the data stored in each node of the doubly linked list from head to tail.
     * Each node's data is printed along with the data in its next and previous nodes, if available.
     */
    public void print() {
        Node<T> current = head;
        while (current != null) {
            current.print();
            System.out.println("\n");
            current = current.next;
        }
    }
}
