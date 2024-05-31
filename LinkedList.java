package com.toDoListApp;

class LinkedList {
    Node head;
    public LinkedList() {
        this.head = null;
    }
    public void insertAt(int data, int pos) {
        Node newNode = new Node(data);
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        for (int i = 1; i < pos - 1; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException("invalid Position");
            }
            current = current.next;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException("invalid Position");
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void delete(int pos) {
        if (head == null) {
            throw new IndexOutOfBoundsException("Position out of range");
        }

        if (pos == 1) {
            head = head.next;
            return;
        }
        Node current = head;
        for (int i = 1; i < pos - 1; i++) {
            if (current.next == null) {
                throw new IndexOutOfBoundsException("Position out of range");
            }
            current = current.next;
        }
        if (current.next == null) {
            throw new IndexOutOfBoundsException("Position out of range");
        }
        current.next = current.next.next;
    }
    public void deleteAfterNode(Node prevNode) {
        int prevNodeData = prevNode.value;
        Node current = head;
        while (current != null && current.value != prevNodeData) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            throw new IllegalArgumentException("The given node or the next node does not exist");
        }
        current.next = current.next.next;

    }
    public boolean searchNode(Node key) {
        Node current = head;
        while (current != null) {
            if (current.value == key.value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.printf("%d ",current.value);
            current = current.next;
        }
        System.out.println();
    }
}
