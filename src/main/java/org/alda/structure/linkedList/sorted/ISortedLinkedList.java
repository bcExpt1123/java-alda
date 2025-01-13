package org.alda.structure.linkedList.sorted;

import org.alda.common.Printable;
import org.alda.structure.linkedList.simple.Node;

public interface ISortedLinkedList<T> extends Printable {
    Node<T> delete(T key);
    Boolean search(T key);
    void sortedInsert(T data);
    Node<T> getHead();
    void setHead(Node<T> head);
}
