package org.alda.structure.stack.array;

import java.util.ArrayList;

/**
 * @author bcExpt1123
 * Stack using ArrayList
 * @param <T>
 */
public class StackArray<T> implements IStackArray<T> {
    private final ArrayList<T> stack;
    public StackArray() {
        stack = new ArrayList<>();
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    public int size() {
        return stack.size();
    }
    public void push(T t) {
        stack.add(t);
    }
    public T pop() {
        if (isEmpty()){
            return null;
        }
        return stack.removeLast();
    }
    public T peek() {
        if (isEmpty()){
            return null;
        }
        return stack.getLast();
    }
}
