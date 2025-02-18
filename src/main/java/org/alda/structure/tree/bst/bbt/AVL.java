package org.alda.structure.tree.bst.bbt;

/**
 * @author bcExpt1123
 *
 * <h1>BBT: Balanced Binary Tree</h1>
 *
 * <h2>AVL Tree</h2>
 * <p>An <b>AVL Tree</b> is a self-balancing binary search tree where the height difference
 * (balance factor) between the left and right subtrees of any node is at most <b>1</b>.</p>
 *
 * <h2>Balancing Factor</h2>
 * <p>The <b>balance factor</b> of a node is calculated as:</p>
 * <pre>
 *     Balance Factor = Height of Right Subtree - Height of Left Subtree
 * </pre>
 * <p>The balance factor must always be in the range <b>[-1, 0, 1]</b> to maintain balance.</p>
 *
 * <h2>Operations</h2>
 * <ul>
 *   <li><b>Rotation</b>: Used to restore balance after insertions and deletions. This includes:
 *     <ul>
 *       <li><b>Single Rotation</b></li>
 *       <li><b>Double Rotation</b></li>
 *     </ul>
 *   </li>
 *   <li><b>Insertion</b>: If inserting a node causes an imbalance, rotations are performed to restore balance.</li>
 *   <li><b>Deletion</b>: Removing a node may also lead to an imbalance, requiring rotations to maintain the AVL property.</li>
 * </ul>
 *
 * <h2>Time Complexity</h2>
 * <p>Due to self-balancing, AVL trees provide efficient operations:</p>
 * <ul>
 *   <li><b>Search</b>: O(log n)</li>
 *   <li><b>Insertion</b>: O(log n)</li>
 *   <li><b>Deletion</b>: O(log n)</li>
 * </ul>
 */
public class AVL<T extends Comparable<T>> {

    public Node<T> insert(Node<T> root, T key) {
        if (root == null) {
            return new Node<>(key);
        } else if (key.compareTo(root.key) < 0) {
            root.left = insert(root.left, key);
        } else {
            root.right = insert(root.right, key);
        }

        root.height = 1 + Math.max(getHeight(root.left), getHeight(root.right));
        Integer balance = getBalance(root);

        if (balance > 1 && key.compareTo(root.left.key) < 0) {
            return rotateRight(root);
        }
        if (balance < -1 && key.compareTo(root.right.key) > 0) {
            return rotateLeft(root);
        }
        if (balance > 1 && key.compareTo(root.left.key) > 0) {
            root.left = rotateLeft(root.left);
            return rotateRight(root);
        }
        if (balance < -1 && key.compareTo(root.right.key) < 0) {
            root.right = rotateRight(root.right);
            return rotateLeft(root);
        }
        return root;
    }

    public Integer getHeight(Node<T> root) {
        if(root == null) return 0;
        return root.height;
    }

    public Integer getBalance(Node<T> root) {
        if(root == null) return 0;
        return getHeight(root.left) + getHeight(root.right);
    }

    public Node<T> rotateRight(Node<T> z) {
        Node<T> y = z.left;
        Node<T> T = y.right;
        y.right = z;
        z.left = T;
        z.height = 1 + Math.max(getHeight(z.left), getHeight(z.right));
        y.height = 1 + Math.max(getHeight(y.left), getHeight(y.right));
        return y;
    }

    public Node<T> rotateLeft(Node<T> z) {
        Node<T> y = z.right;
        Node<T> T = y.left;
        y.left = z;
        z.right = T;
        z.height = 1 + Math.max(getHeight(z.left), getHeight(z.right));
        y.height = 1 + Math.max(getHeight(y.left), getHeight(y.right));
        return y;
    }

    public static class Node<T> {
        T key;
        Node<T> left;
        Node<T> right;
        Integer height;

        public Node(T key){
            this.key = key;
            left = null;
            right = null;
            height = 1;
        }
    }
}


