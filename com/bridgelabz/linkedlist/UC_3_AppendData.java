package com.bridgelabz.linkedlist;

public class UC_3_AppendData {
    public class LinkedList {

        Node head;

        public LinkedList() {
            this.head = null;
        }

        public void Append(Object data) {

            Node newNode = new Node(data);

            if(head == null)
                head = newNode;
            else {
                newNode.next = head;
                head = newNode;
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
            list.Append(70);
            list.Append(30);
            list.Append(56);
            list.Display();
        }
    }
}
