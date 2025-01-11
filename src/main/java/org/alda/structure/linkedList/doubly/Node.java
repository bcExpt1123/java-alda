package org.alda.structure.linkedList.doubly;

import org.alda.common.Printable;

public class Node<T> implements Printable {
    public T data;
    public Node<T> next;
    public Node<T> prev;

    public Node(final T data) {
        this.data = data;
        next = null;
        prev = null;
    }
    public void print() {
        System.out.print("Data: " + data);
        if (next != null) {
            System.out.print(", Next: " + next.data);
        }
        if (prev != null) {
            System.out.print(", Prev: " + prev.data);
        }
    }
}
