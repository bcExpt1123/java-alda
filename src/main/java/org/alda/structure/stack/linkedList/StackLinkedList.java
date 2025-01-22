package org.alda.structure.stack.linkedList;

import org.alda.structure.linkedList.simple.Node;

/**
 * @author bcExpt1123
 *
 * Implementation of a stack using a linked list.
 *
 * @param <T> The type of elements stored in the stack.
 */
public class StackLinkedList<T> implements IStackLinkedList<T> {

    private Node<T> head;

    public StackLinkedList() {
        head = null;
    }

    /**
     * {@inheritDoc}
     * @return
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * {@inheritDoc}
     * @param value The value to be added to the stack.
     */
    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.next = head;
        head = newNode;
    }

    /**
     * {@inheritDoc}
     * @return
     */
    public T pop() {
        if(isEmpty()){
            return null;
        }
        T value = head.data;
        head = head.next;
        return value;
    }

    /**
     * {@inheritDoc}
     * @return
     */
    public T peek() {
        if(isEmpty()){
            return null;
        }
        return head.data;
    }
}
