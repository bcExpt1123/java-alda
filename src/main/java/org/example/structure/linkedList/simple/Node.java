package org.example.structure.linkedList.simple;

import org.example.common.Printable;

public class Node<T> implements Printable {
    public T data;
    public Node<T> next;

    public Node(T data) {
        this.data = data;
        next = null;
    }

    public void print() {
        System.out.print("Data: " + data);
        if(next != null) {
            System.out.print(", Next: " + next.data);
        }
    }
}
