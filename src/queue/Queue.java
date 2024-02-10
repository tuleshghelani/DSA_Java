package queue;

import java.util.Objects;

public class Queue {
    public Node firstNode;
    public Node lastNode;
    public int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Queue(int value) {
        Node newNode = new Node(value);
        firstNode = newNode;
        lastNode = newNode;
        length = 1;
    }

    public Node getFirstNode() {
        System.out.println("Firstnode : " + firstNode.value);
        return firstNode;
    }

    public Node getLastNode() {
        System.out.println("Lastnode : " + lastNode.value);
        return lastNode;
    }

    public int getLength() {
        System.out.println("Length : " + length);
        return length;
    }

    public void printQueue() {
        System.out.println("----------------------------");
        getFirstNode();
        getLastNode();
        getLength();
        Node tempNode = firstNode;
        while(!Objects.equals(tempNode, null)) {
            System.out.println("==> : " + tempNode.value);
            tempNode = tempNode.next;
        }
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if(Objects.equals(length, 0)) {
            firstNode = newNode;
            lastNode = newNode;
        } else {
            lastNode.next = newNode;
            lastNode = newNode;
        }
        length++;
    }

    public Node dequeue() {
        if(Objects.equals(length, 0)) return null;
        Node tempNode = firstNode;
        if(Objects.equals(length, 1)) {
            firstNode = null;
            lastNode = null;
        } else {
            firstNode = tempNode.next;
            tempNode.next = null;
        }
        length--;
        return tempNode;
    }
}
