package org.example.structure.linkedList.simple;

import org.example.common.Printable;

public class SimpleLinkedList<T> implements Printable {
    public Node<T> head;
    public SimpleLinkedList() {
        head = null;
    }
    public void append(T str) {
        Node<T> newNode = new Node<T>(str);
        if (head == null) {
            head = newNode;
            return;
        }
        Node<T> lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
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
