package org.alda.structure.queue;

/**
 * @author bcExpt1123
 *
 * Queue Interface that defines the basic operations of a queue.
 */
public interface IQueue<T> {
    /**
     * Checks if the queue is empty.
     * @return true if the queue is empty, false otherwise.
     */
    boolean isEmpty();

    /**
     * Adds an item to the end of the queue.
     * @param item the item to be added.
     */
    void enqueue(T item);

    /**
     * Removes and returns the item at the front of the queue.
     * @return the item at the front, or null if the queue is empty.
     */
    T dequeue();

    /**
     * Returns the item at the front of the queue without removing it.
     * @return the item at the front, or null if the queue is empty.
     */
    T front();

    /**
     * Returns the item at the rear of the queue without removing it.
     * @return the item at the rear, or null if the queue is empty.
     */
    T rear();
}