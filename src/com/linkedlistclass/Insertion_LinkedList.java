package com.linkedlistclass;

public class Insertion_LinkedList{
        Node head;

        //To find the size of the linkedlist
        private int size;
        //initialize the value of size by creating the constructor
        Insertion_LinkedList(){
        this.size = 0;
        }
class Node{
    String data;
    Node next;

    // Node ka hi constructor
    Node(String data){
        this.data = data;
        this.next = null;  //Jo next reference rhega vo by-dafault sbke liye null rhega baad me koi value deni hogi to denge.


        //Yhan pr node create krre h to yhan pr size count kr lete hai
        size++;
    }
}
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        //Ab hum log ek nayi node bnayenge to traverse and check where is the null point at the existing node.
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void printList(){
        if(head == null){
            System.out.println("List is empty.");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }
    public int getSize(){
        return size;
    }
    public static void main(String [] args){
        //LinkedList bnane k liye humein sbse pehle main class ka object bnana pdega.

        Insertion_LinkedList list  = new Insertion_LinkedList();
        // Now we are going to perform 4 major operations on LinkedList-
		/* (i) Insertion or Add data in linkedlist
		  (ii) Print of linkedlist
		  (iii) To check the size of the linkedlist
		  (iv) Delete element from linkedlist*/

        // Add 2 taraha se hote hai = add first & add last
        list.addFirst("A");
        list.printList();

        list.addFirst("Is");

        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("This");
        list.printList();

        System.out.println(list.getSize());

    }
}