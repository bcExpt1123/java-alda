package org.alda.structure.tree.bst;

/**
 * Node for binary search tree
 * @param <T>
 */
public class Node<T> {
    T key;
    Node<T> left;
    Node<T> right;
    public Node(T key){
        this.key = key;
        left = null;
        right = null;
    }
}
