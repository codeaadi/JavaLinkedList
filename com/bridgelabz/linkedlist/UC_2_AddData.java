package com.bridgelabz.linkedlist;

    public class LinkedList {

        Node head;

        public LinkedList() {
            this.head = null;
        }

        public void AddFirst(Object data) {

            Node newNode = new Node(data);

            if(head == null)
                head = newNode;
            else {
                Node temp = head;
                head = newNode;
                head.next = temp;
            }
        }

        public void Display() {
            Node temp = head;
            while(temp != null) {
                if(temp == null)
                    break;
                else {
                    System.out.print(temp.data + " => ");
                    temp = temp.next;
                }
            }
        }

        public static void main(String[] args) {

            LinkedList list = new LinkedList();
            list.AddFirst(70);
            list.AddFirst(30);
            list.AddFirst(56);
            list.Display();
        }
    }

