package org.sid.globant;

// Reverse a linked List

class NodeList{
    int data;
    NodeList next;
    NodeList(int data){
        this.data=data;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        NodeList head=new NodeList(1);
        head.next = new NodeList(2);
        head.next.next = new NodeList(3);
        head.next.next.next = new NodeList(4);
        head.next.next.next.next = new NodeList(5);
        head.next.next.next.next.next = new NodeList(6);

        System.out.print("Original: ");
        printList(head);

        NodeList nodeList = reverseLinkedList(head);

        System.out.print("Reversed: ");
        printList(nodeList);
    }

    private static NodeList reverseLinkedList(NodeList head) {
        NodeList current = head;
        NodeList prev =null;
        while (current!=null){
            NodeList next = current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }

    public static void printList(NodeList head) {
        while (head != null) {
            System.out.print(head.data + " → ");
            head = head.next;
        }
        System.out.println("null");
    }
}
