package org.alda.structure.linkedList.deque;

import org.alda.common.Printable;

/**
 * @author bcExpt1123
 *
 * The {@code IDoublyEndedList} interface defines the essential operations for a
 * doubly-ended list, which allows appending elements at both the front and the end of the list.
 *
 * <p>This interface extends {@link Printable}, allowing the list to be printed in a human-readable format.</p>
 *
 * @param <T> The type of data stored in the list nodes.
 */
public interface IDoublyEndedList<T> extends Printable {

    /**
     * Appends a new node with the specified data to the front of the list.
     *
     * @param data The data to append at the front of the list.
     */
    void appendFront(T data);

    /**
     * Appends a new node with the specified data to the end of the list.
     *
     * @param data The data to append at the end of the list.
     */
    void appendEnd(T data);

    /**
     * Returns the head (first node) of the linked list.
     *
     * @return The head node.
     */
    Node<T> getHead();

    /**
     * Sets the head (first node) of the linked list.
     *
     * @param head The node to set as the head of the list.
     */
    void setHead(Node<T> head);

    /**
     * Returns the tail (end node) of the linked list.
     *
     * @return The end node.
     */
    Node<T> getTail();

    /**
     * Sets the tail (end node) of the linked list.
     *
     * @param tail The node to set as the end of the list.
     */
    void setTail(Node<T> tail);
}
