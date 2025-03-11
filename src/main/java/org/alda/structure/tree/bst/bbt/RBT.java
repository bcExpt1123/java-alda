package org.alda.structure.tree.bst.bbt;

/**
 * @author bcExpt1123
 *
 * <h1>BBT: Balanced Binary Tree</h1>
 *
 * <h2>Red-Black Tree</h2>
 * <p>A <b>Red-Black Tree</b> is a self-balancing binary search tree with additional properties compared to AVL trees.</p>
 *
 * <h2>Red-Black Properties</h2>
 * <ul>
 *   <li>Every node is colored either <b>red</b> or <b>black</b>.</li>
 *   <li>The root node is always <b>black</b>.</li>
 *   <li>All leaf nodes (NIL nodes) are <b>black</b>.</li>
 *   <li>Red nodes must have black children (no two consecutive red nodes).</li>
 *   <li>Every path from a node to its descendant NIL nodes must contain the same number of black nodes.</li>
 * </ul>
 *
 * <h2>Operations</h2>
 * <ul>
 *   <li><b>Recoloring & Rotations</b>: Used to maintain balance after insertions and deletions.</li>
 *   <li><b>Insertion</b>: After inserting a node, Red-Black properties may be violated, requiring rotations and recoloring.</li>
 *   <li><b>Deletion</b>: Removing a node may cause an imbalance, requiring rebalancing through rotations and recoloring.</li>
 * </ul>
 *
 * <h2>Time Complexity</h2>
 * <p>Red-Black Trees ensure efficient operations with O(log n) complexity:</p>
 * <ul>
 *   <li><b>Search</b>: O(log n)</li>
 *   <li><b>Insertion</b>: O(log n)</li>
 *   <li><b>Deletion</b>: O(log n)</li>
 * </ul>
 */

public class RBT {
}
