package org.alda.structure.stack.linkedList;

/**
 * @author bcExpt1123
 *
 * Interface defining the operations for a stack data structure.
 *
 * @param <T> The type of elements stored in the stack.
 */
public interface IStackLinkedList<T> {
    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise.
     */
    boolean isEmpty();

    /**
     * Pushes a value onto the top of the stack.
     *
     * @param value The value to be added to the stack.
     */
    void push(T value);

    /**
     * Removes and returns the value at the top of the stack.
     *
     * @return The value at the top of the stack, or null if the stack is empty.
     */
    T pop();

    /**
     * Returns the value at the top of the stack without removing it.
     *
     * @return The value at the top of the stack, or null if the stack is empty.
     */
    T peek();

}
