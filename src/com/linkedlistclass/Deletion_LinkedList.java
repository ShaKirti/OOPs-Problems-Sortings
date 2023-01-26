package com.linkedlistclass;

public class Deletion_LinkedList{
    Node head;
    //To find the size of the linkedlist
    private int size;
    //initialize the value of size by creating the constructor
    Deletion_LinkedList(){
        this.size = 0;
    }
    //Deletion of data in linkedlist- (i) deleteFirst   (ii) deleteLast
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = next;
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
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
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
    public static void main(String[] args){
        Deletion_LinkedList list = new Deletion_LinkedList();
        list.addFirst("A");
        list.addFirst("Is");

        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("This");
        list.printList();
        System.out.println(list.getSize());


        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
    }
}