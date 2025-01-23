package org.alda.structure.queue.priority;

import org.alda.common.Comparer;

public class PriorityQueue<T> implements IPriorityQueue<T> {
    private Node<T> head;

    public void enqueue(T data, Integer priority) {
        Node<T> newNode = new Node<>(data, priority);
        Node<T> current = null;
        if(head == null) {
            newNode.next = head;
            head = newNode;
        } else if (Comparer.compare(head.priority, newNode.priority) >= 0) {
            newNode.next = head;
            head = newNode;
        } else {
            current = head;
            while (current.next != null && Comparer.compare(current.next.priority, newNode.priority) < 0) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;

        }
    }

    public T dequeue() {
        if(head == null) {
            return null;
        }
        Node<T> current = head;
        head = head.next;
        return current.data;
    }
}
