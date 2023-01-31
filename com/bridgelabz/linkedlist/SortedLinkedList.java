package com.bridgelabz.linkedlist;

public class SortedLinkedList{
    Node head;
    int size;

    void append(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        Node current = head;
        Node prev = null;
        while (current != null && ((Comparable<Integer>) current.data).compareTo((Integer) data) < 0) {
            prev = current;
            current = current.next;
        }
        if (prev == null) {
            newNode.next = head;
            head = newNode;
        } else {
            newNode.next = current;
            prev.next = newNode;
        }
        size++;
    }
    public void Display() {
        Node temp = head;
        while(temp != null) {
            if(temp.next != null)
                System.out.print(temp.data + " => ");
            else
                System.out.print(temp.data + "\n");
            temp = temp.next;
        }
    }
}
