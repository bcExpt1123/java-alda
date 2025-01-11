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

    public void insertAfter(Node<T> node, T data) {
        if(node == null) {
            System.out.println("The given previous node can not be null.");
            return;
        }
        Node<T> newNode = new Node<>(data);
        newNode.next = node.next;
        node.next = newNode;
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
