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
import org.alda.structure.stack.IStackArray;
import org.alda.structure.stack.StackArray;

public class Main {
    public static void main(String[] args) {
        testStackArray();
    }
    public static void testSimpleLinkedList() {
        ISimpleLinkedList<Integer> intList = new SimpleLinkedList<Integer>();
        intList.append(2);
        intList.append(3);
        intList.append(4);
        intList.append(5);

        intList.insertAfter(intList.getHead(), 22);

        Node<Integer> head = intList.delete(3);

        intList.print();

        head.print();

        System.out.println();
        System.out.println(intList.search(2));
        System.out.println(intList.search(3));
        System.out.println(intList.search(4));
        System.out.println(intList.search(5));
    }

    public static void testDoublyLinkedList() {
        DoublyLinkedList<Integer> intList = new DoublyLinkedList<Integer>();
        intList.append(2);
        intList.append(3);
        intList.append(4);
        intList.append(5);

        intList.print();
    }

    public static void testCircularLinkedList() {
        CircularLinkedList<Integer> intList = new CircularLinkedList<Integer>();

        intList.append(2);
        intList.append(3);
        intList.append(4);
        intList.append(5);

        intList.print();
    }

    public static void testSortedLinkedList() {
        ISortedLinkedList<Integer> intList = new SortedLinkedList<Integer>();

        intList.sortedInsert(10);
        intList.sortedInsert(50);
        intList.sortedInsert(30);
        intList.sortedInsert(70);
        intList.sortedInsert(20);

        intList.print();
    }

    public static void testDoublyEndedList(){
        IDoublyEndedList<Integer> intList = new DoublyEndedList<>();

        intList.appendEnd(1);
        intList.appendEnd(2);
        intList.appendFront(3);
        intList.appendFront(4);
        intList.appendEnd(5);
        intList.appendFront(6);
        intList.appendEnd(7);

        intList.print();
    }

    public static void testStackArray(){
        IStackArray<Integer> intStack = new StackArray<>();

        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        System.out.println(intStack.pop());
        System.out.println(intStack.peek());
        System.out.println(intStack.pop());
    }
}