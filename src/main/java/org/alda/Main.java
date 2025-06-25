package org.alda;

import org.alda.structure.linkedList.circular.CircularLinkedList;
import org.alda.structure.linkedList.deque.DoublyEndedList;
import org.alda.structure.linkedList.deque.IDoublyEndedList;
import org.alda.structure.linkedList.doubly.DoublyLinkedList;
import org.alda.structure.linkedList.simple.ISimpleLinkedList;
import org.alda.structure.linkedList.simple.Node;
import org.alda.structure.linkedList.simple.SimpleLinkedList;
import org.alda.structure.linkedList.sorted.ISortedLinkedList;
import org.alda.structure.linkedList.sorted.SortedLinkedList;
import org.alda.structure.queue.IQueue;
import org.alda.structure.queue.Queue;
import org.alda.structure.queue.array.QueueArray;
import org.alda.structure.queue.linkedList.QueueLinkedList;
import org.alda.structure.queue.priority.IPriorityQueue;
import org.alda.structure.queue.priority.PriorityQueue;
import org.alda.structure.stack.array.IStackArray;
import org.alda.structure.stack.array.StackArray;
import org.alda.structure.stack.linkedList.IStackLinkedList;
import org.alda.structure.stack.linkedList.StackLinkedList;
import org.alda.structure.tree.bst.BinarySearchTree;
import org.alda.structure.tree.bst.bbt.AVL;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Main class demonstrating various data structures with an interactive menu.
 */
public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        
        while (running) {
            displayMainMenu();
            int choice = getMenuChoice(5);
            
            switch (choice) {
                case 1 -> linkedListMenu();
                case 2 -> stackMenu();
                case 3 -> queueMenu();
                case 4 -> treeMenu();
                case 5 -> {
                    System.out.println("\nThank you for using Data Structure Demo!");
                    running = false;
                }
            }
        }
        scanner.close();
    }
    private static void displayMainMenu() {
        System.out.println("\n=== Data Structure Demonstration ===");
        System.out.println("1. Linked Lists");
        System.out.println("2. Stacks");
        System.out.println("3. Queues");
        System.out.println("4. Trees");
        System.out.println("5. Exit");
        System.out.print("\nEnter your choice (1-5): ");
    }

    private static void linkedListMenu() {
        while (true) {
            System.out.println("\n=== Linked List Types ===");
            System.out.println("1. Simple Linked List");
            System.out.println("2. Doubly Linked List");
            System.out.println("3. Circular Linked List");
            System.out.println("4. Sorted Linked List");
            System.out.println("5. Doubly Ended List (Deque)");
            System.out.println("6. Back to Main Menu");
            System.out.print("\nEnter your choice (1-6): ");
            
            int choice = getMenuChoice(6);
            if (choice == 6) break;
            
            System.out.println("\n=== Test Results ===");
            switch (choice) {
                case 1 -> testSimpleLinkedList();
                case 2 -> testDoublyLinkedList();
                case 3 -> testCircularLinkedList();
                case 4 -> testSortedLinkedList();
                case 5 -> testDoublyEndedList();
            }
            pressEnterToContinue();
        }
    }

    private static void stackMenu() {
        while (true) {
            System.out.println("\n=== Stack Types ===");
            System.out.println("1. Array-based Stack");
            System.out.println("2. Linked List-based Stack");
            System.out.println("3. Back to Main Menu");
            System.out.print("\nEnter your choice (1-3): ");
            
            int choice = getMenuChoice(3);
            if (choice == 3) break;
            
            System.out.println("\n=== Test Results ===");
            switch (choice) {
                case 1 -> testStackArray();
                case 2 -> testStackLinkedList();
            }
            pressEnterToContinue();
        }
    }

    private static void queueMenu() {
        while (true) {
            System.out.println("\n=== Queue Types ===");
            System.out.println("1. Simple Queue");
            System.out.println("2. Array-based Queue");
            System.out.println("3. Linked List-based Queue");
            System.out.println("4. Priority Queue");
            System.out.println("5. Back to Main Menu");
            System.out.print("\nEnter your choice (1-5): ");
            
            int choice = getMenuChoice(5);
            if (choice == 5) break;
            
            System.out.println("\n=== Test Results ===");
            switch (choice) {
                case 1 -> testQueue();
                case 2 -> testQueueArray();
                case 3 -> testQueueLinkedList();
                case 4 -> testPriorityQueue();
            }
            pressEnterToContinue();
        }
    }

    private static void treeMenu() {
        System.out.println("\n=== Tree Types ===");
        System.out.println("1. Binary Search Tree");
        System.out.println("2. AVL Tree");
        System.out.println("3. Back to Main Menu");
        System.out.print("\nEnter your choice (1-3): ");
        
        int choice = getMenuChoice(3);
        if (choice == 3) return;
        
        System.out.println("\n=== Test Results ===");
        if (choice == 1) testBST();
        else if (choice == 2) testAVL();
        
        pressEnterToContinue();
    }

    private static int getMenuChoice(int max) {
        while (true) {
            try {
                int choice = Integer.parseInt(scanner.nextLine().trim());
                if (choice >= 1 && choice <= max) {
                    return choice;
                }
                System.out.printf("Please enter a number between 1 and %d: ", max);
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number: ");
            }
        }
    }

    private static void pressEnterToContinue() {
        System.out.print("\nPress Enter to continue...");
        scanner.nextLine();
    }

    public static void testSimpleLinkedList() {
        System.out.println("\n=== Initialize Simple Linked List ===");
        ISimpleLinkedList<Integer> intList = new SimpleLinkedList<Integer>();
        System.out.println("Actions: \n- Append 2, 3, 4, 5");
        intList.append(2);
        intList.append(3);
        intList.append(4);
        intList.append(5);

        System.out.println("- Insert after Head with 22");
        intList.insertAfter(intList.getHead(), 22);

        System.out.println("- Delete 3");
        Node<Integer> head = intList.delete(3);

        System.out.print("\nPrint List:");
        intList.print();

        System.out.print("\n\nHead:");
        head.print();

        System.out.println("\n\nSearch for 2: " + intList.search(2));
        System.out.println("Search for 3: " + intList.search(3));
        System.out.println("Search for 4: " + intList.search(4));
        System.out.println("Search for 5: " + intList.search(5));
    }

    public static void testDoublyLinkedList() {
        System.out.println("\n=== Initialize Doubly Linked List ===");
        DoublyLinkedList<Integer> intList = new DoublyLinkedList<Integer>();
        
        System.out.println("Actions: \nAppend 2, 3, 4, 5");
        intList.append(2);
        intList.append(3);
        intList.append(4);
        intList.append(5);
        
        System.out.print("\nPrint List (Forward):");
        intList.print();
    }

    public static void testCircularLinkedList() {
        System.out.println("\n=== Initialize Circular Linked List ===");
        CircularLinkedList<Integer> intList = new CircularLinkedList<Integer>();

        System.out.println("Actions: \nAppend 2, 3, 4, 5");
        intList.append(2);
        intList.append(3);
        intList.append(4);
        intList.append(5);

        System.out.print("\nPrint List (Forward):");
        intList.print();
    }

    public static void testSortedLinkedList() {
        System.out.println("\n=== Initialize Sorted Linked List ===");
        ISortedLinkedList<Integer> intList = new SortedLinkedList<Integer>();

        System.out.println("Actions: \nSorted Insert 10, 50, 30, 70, 20");
        intList.sortedInsert(10);
        intList.sortedInsert(50);
        intList.sortedInsert(30);
        intList.sortedInsert(70);
        intList.sortedInsert(20);

        System.out.print("\nPrint List (Forward):");
        intList.print();
    }

    public static void testDoublyEndedList(){
        System.out.println("\n=== Initialize Doubly Ended Linked List ===");
        IDoublyEndedList<Integer> intList = new DoublyEndedList<>();

        System.out.println("Actions: \nAppend 1, 2, 3, 4, 5, 6, 7");
        intList.appendEnd(1);
        intList.appendEnd(2);
        intList.appendFront(3);
        intList.appendFront(4);
        intList.appendEnd(5);
        intList.appendFront(6);
        intList.appendEnd(7);

        System.out.print("\nPrint List (Forward):");
        intList.print();
    }

    public static void testStackArray(){
        System.out.println("\n=== Initialize Stack Array ===");
        IStackArray<Integer> intStack = new StackArray<>();

        System.out.println("Actions: \nPush 1, 2, 3");
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        System.out.println("\nPop: " + intStack.pop());
        System.out.println("Peek: " + intStack.peek());
        System.out.println("Pop: " + intStack.pop());
    }

    public static void testStackLinkedList(){
        System.out.println("\n=== Initialize Stack Linked List ===");
        IStackLinkedList<Integer> intStack = new StackLinkedList<>();

        System.out.println("Actions: \nPush 1, 2, 3");
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        System.out.println("\nPop: " + intStack.pop());
        System.out.println("Peek: " + intStack.peek());
        System.out.println("Pop: " + intStack.pop());
    }

    public static void testQueue(){
        System.out.println("\n=== Initialize Queue ===");
        IQueue<Integer> intQueue = new Queue<>();

        System.out.println("Actions: \nEnqueue 1, 2, 3, 4, 5");
        intQueue.enqueue(1);
        intQueue.enqueue(2);
        intQueue.enqueue(3);
        intQueue.enqueue(4);
        intQueue.enqueue(5);

        Integer item = intQueue.dequeue();
        Integer item1 = intQueue.dequeue();
        Integer item2 = intQueue.dequeue();

        Integer front = intQueue.front();
        Integer rear = intQueue.rear();

        System.out.println("\nDequeue: " + item);
        System.out.println("Dequeue: " + item1);
        System.out.println("Dequeue: " + item2);
        System.out.println("Front: " + front);
        System.out.println("Rear: " + rear);
    }

    public static void testQueueArray(){
        System.out.println("\n=== Initialize Queue Array ===");
        IQueue<Integer> intQueue = new QueueArray<>();

        System.out.println("Actions: \nEnqueue 1, 2, 3, 4, 5");
        intQueue.enqueue(1);
        intQueue.enqueue(2);
        intQueue.enqueue(3);
        intQueue.enqueue(4);
        intQueue.enqueue(5);

        Integer item = intQueue.dequeue();
        Integer item1 = intQueue.dequeue();
        Integer item2 = intQueue.dequeue();

        Integer front = intQueue.front();
        Integer rear = intQueue.rear();

        System.out.println("\nDequeue: " + item);
        System.out.println("Dequeue: " + item1);
        System.out.println("Dequeue: " + item2);
        System.out.println("Front: " + front);
        System.out.println("Rear: " + rear);
    }

    public static void testQueueLinkedList(){
        System.out.println("\n=== Initialize Queue Linked List ===");
        IQueue<Integer> intQueue = new QueueLinkedList<>();

        System.out.println("Actions: \nEnqueue 1, 2, 3, 4, 5");
        intQueue.enqueue(1);
        intQueue.enqueue(2);
        intQueue.enqueue(3);
        intQueue.enqueue(4);
        intQueue.enqueue(5);

        Integer item = intQueue.dequeue();
        Integer item1 = intQueue.dequeue();
        Integer item2 = intQueue.dequeue();

        Integer front = intQueue.front();
        Integer rear = intQueue.rear();

        System.out.println("\nDequeue: " + item);
        System.out.println("Dequeue: " + item1);
        System.out.println("Dequeue: " + item2);
        System.out.println("Front: " + front);
        System.out.println("Rear: " + rear);
    }

    public static void testPriorityQueue(){
        System.out.println("\n=== Initialize Priority Queue ===");
        IPriorityQueue<Integer> intQueue = new PriorityQueue<>();

        System.out.println("Actions: \n- Enqueue 2 with priority 1");
        intQueue.enqueue(2, 1);
        System.out.println("- Enqueue 32 with priority 25");
        intQueue.enqueue(32, 25);
        System.out.println("- Enqueue 48 with priority 0");
        intQueue.enqueue(48, 0);
        System.out.println("- Enqueue 15 with priority 3");
        intQueue.enqueue(15, 3);
        System.out.println("- Enqueue 36 with priority 2");
        intQueue.enqueue(36, 2);
        System.out.println("- Enqueue 27 with priority 4");
        intQueue.enqueue(27, 4);

        Integer item = intQueue.dequeue();
        Integer item1 = intQueue.dequeue();
        Integer item2 = intQueue.dequeue();
        Integer item3 = intQueue.dequeue();

        System.out.println("\nDequeue: " + item);
        System.out.println("Dequeue: " + item1);
        System.out.println("Dequeue: " + item2);
        System.out.println("Dequeue: " + item3);
    }

    public static void testBST(){
        System.out.println("\n=== Initialize Binary Search Tree ===");
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        System.out.println("Actions: \n- Insert 5, 3, 7, 1, 20, 4");
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(1);
        bst.insert(20);
        bst.insert(4);

        System.out.println("- Inorder Traversal ");
        System.out.println(bst.inorderTraversal());
        System.out.print("\nSearch for 4: ");
        org.alda.structure.tree.bst.Node<Integer> node = bst.search(4);
        if (node != null) System.out.println("true");
        else System.out.println("false");
    }

    public static void testAVL(){
        AVL<Integer> avl = new AVL<>();
        AVL.Node<Integer> root = null;
        List<Integer> keys = Arrays.asList(10, 20, 30, 40, 50, 25);
        for(Integer key : keys){
            avl.insert(root, key);
        }
    }
}