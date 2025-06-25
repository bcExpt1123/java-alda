package org.alda.structure.linkedList.circular;

import org.alda.common.Printable;

/**
 * @author bcExpt1123
 *
 * The {@code CircularLinkedList} class represents a generic circular linked list.
 * In a circular linked list, the last node points back to the first node,
 * forming a circular structure.
 *
 * <p>This class provides functionality to append new elements to the list and
 * to print the contents of the list in a human-readable format. It implements
 * the {@link Printable} interface.</p>
 *
 * <p>Example usage:</p>
 * <pre>
 * CircularLinkedList<Integer> list = new CircularLinkedList<>();
 * list.append(10);
 * list.append(20);
 * list.append(30);
 * list.print();
 * </pre>
 *
 * @param <T> The type of data stored in the nodes of the list.
 *
 */
public class CircularLinkedList<T> implements Printable {

    /**
     * The head (first node) of the circular linked list.
     */
    public Node<T> head;

    /**
     * Constructs an empty {@code CircularLinkedList}.
     * The {@code head} is initialized to {@code null}.
     */
    public CircularLinkedList() {
        head = null;
    }

    /**
     * Appends a new node containing the specified data to the end of the circular linked list.
     * If the list is empty, the new node becomes the head and points to itself.
     *
     * @param data The data to store in the new node.
     */
    public void append(T data) {
        Node<T> newNode = new Node<>(data);
        Node<T> current;
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }

    /**
     * Prints the data stored in each node of the circular linked list.
     * The traversal stops when the list has looped back to the head.
     */
    public void print() {
        Node<T> current = head;
        while (current != null) {
            current.print();
            current = current.next;
            if(current == head) {
                break;
            }
        }
    }
}
