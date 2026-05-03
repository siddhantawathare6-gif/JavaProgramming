package org.sid.globant;

import java.util.HashSet;
import java.util.Set;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class linkedListRepVal {
    public static void main(String[] args) {
        // Creating Linked List: 1 → 2 → 3 → 2 → 4 → 3
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(3);

        findDuplicate(head);
    }


    public static void findDuplicate(Node head) {
        Node current = head;
        Set<Integer> integerSet = new HashSet<>();
        System.out.print("Duplicates: ");
        while (current != null) {
            if (integerSet.contains(current.data)) {
                System.out.print(current.data + " ");
            } else {
                integerSet.add(current.data);
            }
            current = current.next;
        }
    }
}

