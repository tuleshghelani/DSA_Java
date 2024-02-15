package binarySearchTree;

import java.util.Objects;

public class BinarySearchTree {
    private Node root;

    class Node {
        int value;
        Node leftNode;
        Node rightNode;

        Node(int value) {
            this.value = value;
        }
    }

    public Node getRoot() {
        System.out.println("Root : " + root.value);
        return root;
    }

    public Boolean insert(int value) {
        Node newNode = new Node(value);
        if (Objects.equals(root, null)) {
            root = newNode;
            return true;
        }
        Node tempNode = root;
        while (true) {
            if (Objects.equals(newNode.value, tempNode.value)) return false;
            if (newNode.value < tempNode.value) {
                if (Objects.equals(tempNode.leftNode, null)) {
                    tempNode.leftNode = newNode;
                    return true;
                }
                tempNode = tempNode.leftNode;
            } else {
                if (Objects.equals(tempNode.rightNode, null)) {
                    tempNode.rightNode = newNode;
                    return true;
                }
                tempNode = tempNode.rightNode;
            }
        }
    }

    public Boolean contains(int value) {
        if (Objects.equals(root, null)) return false;
        Node tempNode = root;
        while (!Objects.equals(tempNode, null)) {
            if (tempNode.value > value) {
                tempNode = tempNode.leftNode;
            } else if (tempNode.value < value) {
                tempNode = tempNode.rightNode;
            } else {
                return true;
            }
        }
        return false;
    }
}
