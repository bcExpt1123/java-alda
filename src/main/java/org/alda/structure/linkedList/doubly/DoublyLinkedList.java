package org.alda.structure.linkedList.doubly;

import org.alda.common.Printable;

public class DoublyLinkedList<T> implements Printable {
    public Node<T> head;
    public Node<T> tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public void append(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void prepend(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void print() {
        Node<T> current = head;
        while (current != null) {
            current.print();
            System.out.println("\n");
            current = current.next;
        }
    }
}
