package org.alda.structure.linkedList.sorted;

import org.alda.common.Comparer;
import org.alda.structure.linkedList.simple.Node;
import org.alda.structure.linkedList.simple.SimpleLinkedList;

/**
 * @author bcExpt1123
 *
 * The {@code SortedLinkedList} class implements a sorted singly linked list
 * where elements are inserted in sorted order. It extends {@link SimpleLinkedList}
 * and provides an additional method for sorted insertion.
 *
 * <p>This class implements the {@link ISortedLinkedList} interface, providing
 * concrete implementations of its methods.</p>
 *
 * <p>Example usage:</p>
 * <pre>
 * SortedLinkedList<Integer> sortedList = new SortedLinkedList<>();
 * sortedList.sortedInsert(10);
 * sortedList.sortedInsert(5);
 * sortedList.sortedInsert(20);
 * sortedList.print();
 * </pre>
 *
 * @param <T> The type of data stored in the list's nodes.
 * @see SimpleLinkedList
 * @see ISortedLinkedList
 * @see Comparer
 */
public class SortedLinkedList<T> extends SimpleLinkedList<T> implements ISortedLinkedList<T> {

    /**
     * Constructs an empty {@code SortedLinkedList}.
     */
    public SortedLinkedList() {
        super();
    }

    /**
     * Inserts a new node with the specified data into the list while maintaining sorted order.
     * The {@code Comparer} utility is used to compare node data.
     *
     * @param data The data to insert.
     */
    public void sortedInsert(T data) {
        Node<T> newNode = new Node<>(data);
        Node<T> current = null;
        if(getHead() == null) {
            newNode.next = getHead();
            setHead(newNode);
        } else if (Comparer.compare(getHead().data, newNode.data) >= 0) {
            newNode.next = getHead();
            setHead(newNode);
        } else {
            current = getHead();
            while (current.next != null && Comparer.compare(current.next.data, newNode.data) < 0) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;

        }
    }
}
