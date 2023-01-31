package com.bridgelabz.linkedlist;

public class LinkedList {

    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void Add(Object data) {

        Node newNode = new Node(data);

        if(head == null)
            head = newNode;
        else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void insert(Object data, Object key) {
        Node newNode = new Node(data);
        Node current = head;
        while (current.data != key) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    public void Search(Object searchData) {
        if(head.data == searchData)
            System.out.println(searchData+" is Found");
        else {
            Node temp = head;
            boolean isFound = false;
            while(temp != null) {
                if(temp.data == searchData) {
                    isFound = true;
                    break;
                }
                temp = temp.next;
            }
            if(isFound == true)
                System.out.println(searchData+" is Found");
            else
                System.out.println(searchData+" is Not Found");
        }
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

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.Add(70);
        list.Add(56);
        list.insert(30, 56);
        list.Display();
        list.Search(30);
        list.insert(40, 30);
        list.Display();
    }
}

