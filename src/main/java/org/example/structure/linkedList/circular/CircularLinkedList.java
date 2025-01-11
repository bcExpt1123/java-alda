package org.example.structure.linkedList.circular;

import org.example.common.Printable;

public class CircularLinkedList<T> implements Printable {
    public Node<T> head;

    public CircularLinkedList() {
        head = null;
    }

    public void append(T data) {
        Node<T> newNode = new Node<>(data);
        Node<T> current;
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }

    public void print() {
        Node<T> current = head;
        while (current != null) {
            current.print();
            System.out.println("\n");
            current = current.next;
            if(current == head) {
                break;
            }
        }
    }
}
