package DoublyLinkedList;

import java.util.Objects;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;


    class Node {
        Node nextNode;
        Node prevNode;
        int value;
        Node(int value) {
            this.value = value;
        }
    }

    DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length++;
    }

    public void getHead() {
        System.out.println("Head : " + head);
    }

    public void getTail() {
        System.out.println("Tail : " + tail);
    }

    public void printData() {
        System.out.println("------------------------");
        System.out.println("length : " + length);
        Node tempNode = head;
        while (!Objects.equals(tempNode, null)) {
            System.out.println("value : " + tempNode.value);
            tempNode = tempNode.nextNode;
        }
    }
}
