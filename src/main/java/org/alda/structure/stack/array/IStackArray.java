package org.alda.structure.stack.array;

/**
 * @author bcExpt1123
 * @param <T>
 */
public interface IStackArray<T> {
    boolean isEmpty(); // Check if the stack is empty
    int size();        // Get the size of the stack
    void push(T t);    // Push an element onto the stack
    T pop();           // Pop an element from the stack
    T peek();          // Peek at the top element of the stack
}
