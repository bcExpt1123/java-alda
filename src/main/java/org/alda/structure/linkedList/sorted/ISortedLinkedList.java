package org.alda.structure.linkedList.sorted;

import org.alda.common.Printable;
import org.alda.structure.linkedList.simple.Node;

/**
 * @author bcExpt1123
 *
 * The {@code ISortedLinkedList} interface defines the essential operations
 * for a sorted singly linked list, including deleting, searching, and inserting
 * elements in sorted order.
 *
 * <p>This interface extends {@link Printable}, allowing the entire list to be printed.</p>
 *
 * @param <T> The type of data stored in the linked list nodes.
 */
public interface ISortedLinkedList<T> extends Printable {

    /**
     * Deletes the first node that contains the specified key.
     *
     * @param key The data to delete from the list.
     * @return The head of the modified list.
     */
    Node<T> delete(T key);

    /**
     * Searches for a node containing the specified key.
     *
     * @param key The data to search for.
     * @return {@code true} if a node containing the key is found; {@code false} otherwise.
     */
    Boolean search(T key);

    /**
     * Inserts a new node with the specified data into the list while maintaining sorted order.
     *
     * @param data The data to insert.
     */
    void sortedInsert(T data);

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
}
