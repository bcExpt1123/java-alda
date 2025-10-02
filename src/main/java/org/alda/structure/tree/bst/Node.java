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
    /**
     * Constructs a new node with the specified key and no child nodes.
     *
     * @param key the value to store in this node
     */
    public Node(T key){
        this.key = key;
        left = null;
        right = null;
    }

    /**
     * Print the node's key and the keys of its left and right children to standard output.
     *
     * The output is "Data: [key]" with ", Left: [left.key]" and ", Right: [right.key]" appended only when those children are present.
     */
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
