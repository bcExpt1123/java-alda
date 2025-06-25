package org.alda.structure.tree.bst;

import org.alda.common.Printable;

/**
 * Node for binary search tree
 * @param <T>
 */
public class Node<T> implements Printable {
    T key;
    Node<T> left;
    Node<T> right;
    public Node(T key){
        this.key = key;
        left = null;
        right = null;
    }

    public void print() {
        System.out.print("\nData: " + key);
        if (left != null) {
            System.out.print(", Left: " + left.key);
        }
        if (right != null) {
            System.out.print(", Right: " + right.key);
        }
    }
}
