package org.alda.structure.tree.bst;

import java.util.ArrayList;

/**
 * @author bcExpt1123
 *
 * Binary Search Tree
 * @param <T>
 */
public class BinarySearchTree<T extends Comparable<T>> {
    Node<T> root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(T key) {
        root = _insertRecursive(root, key);
    }

    protected Node<T> _insertRecursive(Node<T> root, T key){
        if (root == null) {
            return new Node<>(key);
        }
        if (key.compareTo(root.key) < 0) {
            root.left = _insertRecursive(root.left, key);
        } else if (key.compareTo(root.key) > 0) {
            root.right = _insertRecursive(root.right, key);
        }
        return root;
    }

    public Node<T> search(T key) {
        return _searchRecursive(root, key);
    }

    protected Node<T> _searchRecursive(Node<T> root, T key){
        if (root == null || root.key.equals(key)) {
            return root;
        }
        if (key.compareTo(root.key) < 0) {
            return _searchRecursive(root.left, key);
        }
        return _searchRecursive(root.right, key);
    }

    public ArrayList<T> inorderTraversal() {
        ArrayList<T> result = new ArrayList<>();
        _inorderTraversal(root, result);
        return result;
    }

    protected void _inorderTraversal(Node<T> root, ArrayList<T> result) {
        if (root != null) {
            _inorderTraversal(root.left, result);
            result.add(root.key);
            _inorderTraversal(root.right, result);
        }
    }
}
