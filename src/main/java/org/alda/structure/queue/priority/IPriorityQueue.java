package org.alda.structure.queue.priority;

public interface IPriorityQueue<T> {
    void enqueue(T element, Integer priority);
    T dequeue();
}
