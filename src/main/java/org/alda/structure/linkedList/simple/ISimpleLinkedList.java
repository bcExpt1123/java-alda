package org.alda.structure.linkedList.simple;

import org.alda.common.Printable;

public interface ISimpleLinkedList<T> extends Printable {
    void append(T str);
    void insertAfter(Node<T> node, T data);
    Node<T> delete(T key);
    Node<T> getHead();
    Boolean search(T key);
}
