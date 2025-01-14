package org.alda.structure.linkedList.simple;

import org.alda.common.Printable;

/**
 * @author bcExpt1123
 *
 * The {@code ISimpleLinkedList} interface defines the essential operations
 * for a singly linked list, including adding, deleting, and searching elements.
 *
 * <p>This interface extends {@link Printable}, allowing the entire list to be printed.</p>
 *
 * @param <T> The type of data stored in the linked list nodes.
 */
public interface ISimpleLinkedList<T> extends Printable {

    /**
     * Appends a new node with the specified data to the end of the list.
     *
     * @param str The data to add to the list.
     */
    void append(T str);

    /**
     * Inserts a new node with the specified data after the given node.
     *
     * @param node The node after which the new node is inserted.
     * @param data The data to store in the new node.
     */
    void insertAfter(Node<T> node, T data);

    /**
     * Deletes the first node that contains the specified key.
     *
     * @param key The data to delete from the list.
     * @return The head of the modified list.
     */
    Node<T> delete(T key);

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
     * Searches for a node containing the specified key.
     *
     * @param key The data to search for.
     * @return {@code true} if a node containing the key is found; {@code false} otherwise.
     */
    Boolean search(T key);
}
