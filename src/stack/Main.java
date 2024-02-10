package stack;

public class Main {
    public static void main(String[] args) {
        Stack myFirstStack = new Stack(5);
        myFirstStack.getTopNode();
        myFirstStack.getHeight();
        myFirstStack.printStck();

        myFirstStack.push(11);
        myFirstStack.push(22);
        myFirstStack.push(33);
        myFirstStack.printStck();

        myFirstStack.pop();
        myFirstStack.pop();
        myFirstStack.printStck();
    }
}
