package com.bridgelabz.linkedlist;

public class LinkedList {

    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void Add(Object data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void Display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ==> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.Add(56);
        list.Add(30);
        list.Add(70);
        list.Display();
    }
}