package org.alda.structure.tree.bst.bbt;

import org.alda.common.Utils;

public class AVLTest {
    public static void main(String[] args) {
        System.out.println("\n=== Initialize AVL Tree ===");
        AVL<Integer> avl = new AVL<>();
        AVL.Node<Integer> root = null;

        // Insert elements to test rotations
        int[] elements = {10, 20, 30, 40, 50, 25};

        System.out.println("Actions: \n- Insert " + Utils.intArrToStr(elements));
        for (int el : elements) {
            root = avl.insert(root, el);
        }

        // Print tree in in-order
        System.out.println("\nIn-order traversal:");
        inOrder(root);

        // Print tree structure
        System.out.println("\n\nTree structure:");
        printTree(root, "", true);
    }

    // In-order traversal (left-root-right)
    public static <T extends Comparable<T>> void inOrder(AVL.Node<T> node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.key + " ");
            inOrder(node.right);
        }
    }

    // Pretty-print the tree
    public static <T extends Comparable<T>> void printTree(AVL.Node<T> node, String prefix, boolean isTail) {
        if (node == null) return;

        System.out.println(prefix + (isTail ? "└── " : "├── ") + node.key + " (h=" + node.height + ")");

        if (node.left != null || node.right != null) {
            if (node.right != null)
                printTree(node.right, prefix + (isTail ? "    " : "│   "), node.left == null);
            if (node.left != null)
                printTree(node.left, prefix + (isTail ? "    " : "│   "), true);
        }
    }
}
