package org.alda.structure.linkedList.deque;

/**
 * @author bcExpt1123
 *
 * A generic class that represents a doubly-ended linked list.
 * @param <T> The type of the elements stored in the list.
 */
public class DoublyEndedList<T> implements IDoublyEndedList<T>{
    private Node<T> head;
    private Node<T> tail;

    public DoublyEndedList() {
        head = null;
        tail = null;
    }

    /**
     * Adds a new node with the given data to the front of the list.
     * If the list is empty, the new node becomes both the head and the tail.
     * @param data The data to be stored in the new node.
     */
    public void appendFront(T data) {
        Node<T> newNode = new Node<>(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    /**
     * Adds a new node with the given data to the end of the list.
     * If the list is empty, the new node becomes both the head and the tail.
     * @param data The data to be stored in the new node.
     */
    public void appendEnd(T data) {
        Node<T> newNode = new Node<>(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    /**
     * Prints the data of each node in the list from head to tail.
     */
    public void print() {
        Node<T> current = head;
        while (current != null) {
            current.print();
            current = current.next;
        }
    }
}
