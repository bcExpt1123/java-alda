package org.example;

import org.example.structure.linkedList.circular.CircularLinkedList;
import org.example.structure.linkedList.doubly.DoublyLinkedList;
import org.example.structure.linkedList.simple.Node;
import org.example.structure.linkedList.simple.SimpleLinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        testSimpleLinkedList();
    }
    public static void testSimpleLinkedList() {
        SimpleLinkedList<Integer> intList = new SimpleLinkedList<Integer>();
        intList.append(2);
        intList.append(3);
        intList.append(4);
        intList.append(5);

        intList.insertAfter(intList.head, 22);

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
}