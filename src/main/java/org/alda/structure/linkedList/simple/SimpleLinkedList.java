package org.alda.structure.linkedList.simple;

/**
 * @author bcExpt1123
 *
 * The {@code SimpleLinkedList} class implements a singly linked list with basic operations
 * such as appending, inserting, deleting, and searching nodes.
 *
 * <p>This class implements the {@link ISimpleLinkedList} interface, providing a
 * concrete implementation of its methods.</p>
 *
 * <p>Example usage:</p>
 * <pre>
 * SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
 * list.append(10);
 * list.append(20);
 * list.insertAfter(list.getHead(), 15);
 * list.print();
 * </pre>
 *
 * @param <T> The type of data stored in the list's nodes.
 */
public class SimpleLinkedList<T> implements ISimpleLinkedList<T> {

    /**
     * The head (first node) of the linked list.
     */
    private Node<T> head;

    /**
     * Constructs an empty {@code SimpleLinkedList}.
     * The {@code head} is initialized to {@code null}.
     */
    public SimpleLinkedList() {
        head = null;
    }

    /**
     * Appends a new node with the specified data to the end of the list.
     *
     * @param str The data to add to the list.
     */
    public void append(T str) {
        Node<T> newNode = new Node<T>(str);
        if (head == null) {
            head = newNode;
            return;
        }
        Node<T> lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    /**
     * Inserts a new node with the specified data after the given node.
     *
     * @param node The node after which the new node is inserted.
     * @param data The data to store in the new node.
     */
    public void insertAfter(Node<T> node, T data) {
        if(node == null) {
            System.out.println("The given previous node can not be null.");
            return;
        }
        Node<T> newNode = new Node<>(data);
        newNode.next = node.next;
        node.next = newNode;
    }

    /**
     * Deletes the first node that contains the specified key.
     *
     * @param key The data to delete from the list.
     * @return The head of the modified list.
     */
    public Node<T> delete(T key) {
        Node<T> node = head;
        if (node != null && node.data.equals(key)) {
            head = node.next;
            node = null;
            return head;
        }
        Node<T> prev = null;
        while (node != null) {
            if(node.data.equals(key)) {
                break;
            }
            prev = node;
            node = node.next;
        }
        if(node == null) {
            return head;
        }
        if(prev != null){
            prev.next = node.next;
        }
        node = null;
        return head;
    }

    /**
     * Searches for a node containing the specified key.
     *
     * @param key The data to search for.
     * @return {@code true} if a node containing the key is found; {@code false} otherwise.
     */
    public Boolean search(T key) {
        Node<T> node = head;
        while (node != null) {
            if(node.data.equals(key)) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    /**
     * Returns the head (first node) of the linked list.
     *
     * @return The head node.
     */
    public Node<T> getHead() {
        return head;
    }

    /**
     * Sets the head (first node) of the linked list.
     *
     * @param head The node to set as the head of the list.
     */
    public void setHead(Node<T> head) {
        this.head = head;
    }

    /**
     * Prints the data stored in each node of the linked list from head to tail.
     */
    public void print() {
        Node<T> current = head;
        while (current != null) {
            current.print();
            System.out.println("\n");
            current = current.next;
        }
    }
}
