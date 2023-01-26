package com.linkedlistclass;

import java.util.LinkedList;

public class LL_usingLinkedList_Library {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("a");

        list.addFirst("is");

        //list.addLast("list");
        list.add("list");     //by-default linkedlist me element last me add hota hai

        list.addFirst("This");
        System.out.println(list);

        //To print linkedlist we always use for loop-
        for(int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + "->");
        System.out.println("null");



        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        /*To remove or delete element by indexing or by searching
          list.remove(3); //remove element from 3rd index
          System.out.println(list);
         */
        for(int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + "->");
        System.out.println("null");
    }
}
