package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(5);
        myDoublyLinkedList.printData();

        myDoublyLinkedList.append(11);
        myDoublyLinkedList.append(22);
        myDoublyLinkedList.append(33);
        myDoublyLinkedList.append(44);
        myDoublyLinkedList.printData();

        myDoublyLinkedList.removeLastNode();
        myDoublyLinkedList.printData();

        myDoublyLinkedList.removeFirstNode();
        myDoublyLinkedList.printData();

        myDoublyLinkedList.prepend(1);
        myDoublyLinkedList.prepend(2);
        myDoublyLinkedList.printData();

        System.out.println("get(2) : " + myDoublyLinkedList.get(2).value);

        myDoublyLinkedList.set(2, 8);
        myDoublyLinkedList.printData();

        myDoublyLinkedList.insert(2, 9);
        myDoublyLinkedList.printData();

        myDoublyLinkedList.remove(2);
        myDoublyLinkedList.printData();
    }
}
