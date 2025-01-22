package org.alda.structure.queue.array;

import org.alda.structure.queue.IQueue;

import java.util.ArrayList;

/**
 * @author bcExpt1123
 *
 * Implementation of a generic Queue using an ArrayList.
 * @param <T>
 */
public class QueueArray<T> implements IQueue<T> {
    /**
     * Internal storage for the queue elements.
     */
    public ArrayList<T> items;

    public QueueArray() {
        items = new ArrayList<>();
    }

    /**
     * {@inheritDoc}
     * @return
     */
    public boolean isEmpty() {
        return items.isEmpty();
    }

    /**
     * {@inheritDoc}
     * @param item the item to be added.
     */
    public void enqueue(T item) {
        items.add(item);
    }

    /**
     * {@inheritDoc}
     * @return
     */
    public T dequeue() {
        if (items.isEmpty()) {
            return null;
        }
        return items.removeLast();
    }

    /**
     * {@inheritDoc}
     * @return
     */
    public T front() {
        if (items.isEmpty()) {
            return null;
        }
        return items.getFirst();
    }

    /**
     * {@inheritDoc}
     * @return
     */
    public T rear(){
        if (items.isEmpty()) {
            return null;
        }
        return items.getLast();
    }
}
