package org.example.structure.linkedList.simple;

import jdk.jshell.spi.SPIResolutionException;
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

    public Node<T> delete(T key) {
        Node<T> node = head;
        if (node != null && node.data.equals(key)) {
            head = node.next;
            node = null;
            return head;
        }
        Node<T> prev = null;
        while (node != null) {
            if(node.data.equals(key)) {
                break;
            }
            prev = node;
            node = node.next;
        }
        if(node == null) {
            return head;
        }
        if(prev != null){
            prev.next = node.next;
        }
        node = null;
        return head;
    }

    public Boolean search(T key) {
        Node<T> node = head;
        while (node != null) {
            if(node.data.equals(key)) {
                return true;
            }
            node = node.next;
        }
        return false;
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
