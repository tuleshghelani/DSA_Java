package binarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBinarySearchTree = new BinarySearchTree();
        myBinarySearchTree.insert(50);
        myBinarySearchTree.insert(40);
        myBinarySearchTree.insert(30);
        myBinarySearchTree.insert(90);
        myBinarySearchTree.insert(80);
        myBinarySearchTree.insert(60);

        System.out.println(myBinarySearchTree.contains(40));
        System.out.println(myBinarySearchTree.contains(45));
        System.out.println(myBinarySearchTree.contains(5));
        System.out.println(myBinarySearchTree.contains(50));
    }
}
