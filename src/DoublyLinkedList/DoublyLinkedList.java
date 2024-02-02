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

    public void append(int value) {
        Node newNode = new Node(value);
        if (Objects.equals(length, 0)) {
            head = newNode;
            tail = newNode;
        } else {
            tail.nextNode = newNode;
            newNode.prevNode = tail;
            tail = newNode;
        }
        length++;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (Objects.equals(length, 0)) {
            head = newNode;
            tail = newNode;
        } else {
            head.prevNode = newNode;
            newNode.nextNode = head;
            head = newNode;
        }
        length++;
    }

    public Node removeLastNode() {
        if (length == 0) return null;
        Node tempLastNode = tail;
        if (Objects.equals(length, 1)) {
            head = null;
            tail = null;
        } else {
            tail = tail.prevNode;
            tail.nextNode = null;
            tempLastNode.prevNode = null;
        }
        length--;
        return tempLastNode;
    }

    public Node removeFirstNode() {
        if (length == 0) return null;
        Node tempFirstNode = head;
        if (Objects.equals(length, 1)) {
            head = null;
            tail = null;
        } else {
            head = head.nextNode;
            head.prevNode = null;
            tempFirstNode.nextNode = null;
        }
        length--;
        return tempFirstNode;
    }

    public Node get(int index) {
        if (index < 0 && index >= length) return null;
        Node tempNode = head;
        if (index < (length / 2)) {
            for (int i = 0; i < index; i++) {
                tempNode = tempNode.nextNode;
            }
        } else {
            tempNode = tail;
            for (int i = length - 1; i > index; i--) {
                tempNode = tempNode.prevNode;
            }
        }
        return tempNode;
    }

    public Boolean set(int index, int value) {
        Node tempNode = get(index);
        if (!Objects.equals(tempNode, null)) {
            tempNode.value = value;
            return true;
        }
        return false;
    }

    public Boolean insert(int index, int value) {
        if (index < 0 && index > length) return false;
        Node newNode = new Node(value);
        if (Objects.equals(length, 0)) {
            prepend(value);
            return true;
        }
        if (Objects.equals(index, length)) {
            append(value);
            return true;
        }
        Node beforeNode = get(index - 1);
        Node afterNode = beforeNode.nextNode;
        beforeNode.nextNode = newNode;
        newNode.prevNode = beforeNode;
        afterNode.prevNode = newNode;
        newNode.nextNode = afterNode;
        length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 && index > length) return null;
        if (Objects.equals(index, 0)) return removeFirstNode();
        if (Objects.equals(index, length - 1)) return removeLastNode();

        Node tempNode = get(index);
        tempNode.nextNode.prevNode = tempNode.prevNode;
        tempNode.prevNode.nextNode = tempNode.nextNode;
        tempNode.nextNode = null;
        tempNode.prevNode = null;
        length--;
        return tempNode;
    }
}
