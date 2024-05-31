package com.toDoListApp;
public class Main {
    public static void main(String[] args) {
        LinkedList list =new LinkedList();
        list.insertAt(10,1);
        list.insertAt(20,2);
        list.insertAt(30,3);
        list.insertAt(40,4);
        list.display();
        list.delete(3);
        list.display();
        list.deleteAfterNode(new Node(20));
        list.display();
        System.out.println(list.searchNode(new Node(20)));
        System.out.println(list.searchNode(new Node(30)));
    }
}