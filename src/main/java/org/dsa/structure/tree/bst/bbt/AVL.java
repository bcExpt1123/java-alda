package org.dsa.structure.tree.bst.bbt;

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

    /**
     * Inserts a key into the subtree rooted at the given node and restores AVL balance.
     *
     * If the key already exists in the subtree, the tree is left unchanged (duplicates are not inserted).
     *
     * @param root the root of the subtree where the key should be inserted; may be null
     * @param key  the value to insert
     * @return     the root of the subtree after insertion and any necessary rebalancing
     */
    public Node<T> insert(Node<T> root, T key) {
        if (root == null) {
            return new Node<>(key);
        } else if (key.compareTo(root.key) < 0) {
            root.left = insert(root.left, key);
        } else if (key.compareTo(root.key) > 0) {
            root.right = insert(root.right, key);
        } else {
            return root; // Duplicate keys not allowed
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

    /**
     * Returns the height of the given node in the AVL subtree.
     *
     * @param root the node whose height is requested; may be {@code null}
     * @return the node's height, or 0 if {@code root} is {@code null}
     */
    public Integer getHeight(Node<T> root) {
        if(root == null) return 0;
        return root.height;
    }

    /**
     * Computes the balance factor of the given node.
     *
     * @param root the node whose balance factor to compute
     * @return the balance factor defined as height(left subtree) minus height(right subtree); returns 0 if {@code root} is null
     */
    public Integer getBalance(Node<T> root) {
        if (root == null) return 0;
        return getHeight(root.left) - getHeight(root.right);
    }

    /**
     * Performs a right rotation around the given subtree root.
     *
     * <p>Reassigns child pointers and updates node heights so the left child becomes the new root of the subtree.</p>
     *
     * @param z the root of the subtree to rotate; must have a non-null left child
     * @return the new root of the subtree after rotation
     */
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


