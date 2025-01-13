package org.alda.structure.linkedList.sorted;

import org.alda.common.Comparer;
import org.alda.structure.linkedList.simple.Node;
import org.alda.structure.linkedList.simple.SimpleLinkedList;

public class SortedLinkedList<T> extends SimpleLinkedList<T> implements ISortedLinkedList<T> {
    public SortedLinkedList() {
        super();
    }

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
