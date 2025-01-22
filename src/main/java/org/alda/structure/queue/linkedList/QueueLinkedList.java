package org.alda.structure.queue.linkedList;

import org.alda.structure.linkedList.simple.Node;
import org.alda.structure.queue.IQueue;

import java.util.ArrayList;

/**
 * @author bcExpt1123
 *
 * Implementation of a generic Queue using a LinkedList.
 * @param <T>
 */
public class QueueLinkedList<T> implements IQueue<T> {

    public Node<T> front;
    public Node<T> rear;


    public QueueLinkedList() {
        front = null;
        rear = null;
    }

    /**
     * {@inheritDoc}
     * @return
     */
    public boolean isEmpty() {
        return front == null;
    }

    /**
     * {@inheritDoc}
     * @param item the item to be added.
     */
    public void enqueue(T item) {
        Node<T> newNode = new Node<>(item);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
             rear.next = newNode;
             rear = newNode;
        }
    }

    /**
     * {@inheritDoc}
     * @return
     */
    public T dequeue() {
        T popped = null;
        if (!isEmpty()) {
            popped = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
        }
        return popped;
    }

    /**
     * {@inheritDoc}
     * @return
     */
    public T front() {
        if (isEmpty()) {
            return null;
        }
        return front.data;
    }

    /**
     * {@inheritDoc}
     * @return
     */
    public T rear(){
        if (isEmpty()) {
            return null;
        }
        return rear.data;
    }
}
