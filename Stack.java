package com.toDoListApp;

public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public String pop() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("empty stack");
        }
        int popData = top.value;
        top = top.next;
        return "the value is deleted";
    }

    public int peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("empty stack");
        }
        return top.value;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        Node current = top;
        while (current != null) {
            System.out.printf("%d -> ", current.value);
            current = current.next;
        }
        System.out.println("null");
    }
}
