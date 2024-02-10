package queue;

public class Main {
    public static void main(String[] args) {
        Queue myFirstQueue = new Queue(5);
        myFirstQueue.getFirstNode();
        myFirstQueue.getLastNode();
        myFirstQueue.getLength();
        myFirstQueue.printQueue();

        myFirstQueue.enqueue(11);
        myFirstQueue.enqueue(22);
        myFirstQueue.enqueue(33);
        myFirstQueue.printQueue();

        myFirstQueue.dequeue();
        myFirstQueue.dequeue();
        myFirstQueue.printQueue();
    }
}
