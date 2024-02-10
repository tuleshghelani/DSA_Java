package stack;

import java.util.Objects;

public class Stack {
    private Node topNode;
    private int height = 0;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Stack(int value) {
        Node newNode = new Node(value);
        this.topNode = newNode;
        this.height = 1;
    }

    public void printStck() {
        System.out.println("--------------------------");
        getHeight();
        getTopNode();
        Node tempNode = topNode;
        while (!Objects.equals(tempNode, null)) {
            System.out.println(" ==> : " + tempNode.value);
            tempNode = tempNode.next;
        }
    }

    public Node getTopNode() {
        System.out.println("topNode : " + this.topNode.value);
        return topNode;
    }

    public int getHeight() {
        System.out.println("Height : " + this.height);
        return height;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (Objects.equals(this.height, 0)) {
            this.topNode = newNode;
        } else {
            newNode.next = topNode;
            this.topNode = newNode;
        }
        this.height++;
    }

    public Node pop() {
        if (Objects.equals(height, 0)) return null;
        Node tempNode = topNode;
        topNode = topNode.next;
        tempNode.next = null;
        height--;
        return tempNode;
    }

}
