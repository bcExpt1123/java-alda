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
     * Prints the node's key and the keys of its left and right children, if present, to the standard output.
     *
     * The output format is: "Data: [key], Left: [left.key], Right: [right.key]". Child information is omitted if the respective child is null.
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
