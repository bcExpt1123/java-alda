package org.alda.structure.queue.priority;

public class Node<T> {
    public T data;
    public Integer priority;
    public Node<T> next;

    public Node(T data, Integer priority){
        this.data = data;
        this.priority = priority;
    }
}
