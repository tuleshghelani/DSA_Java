package hashtable;

import java.util.ArrayList;
import java.util.Objects;

public class Hashtable {
    private int size = 7;
    private Node dataMap[];

    class Node {
        String key;
        int value;
        Node next;

        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public Hashtable() {
        dataMap = new Node[size];
    }

    public void printHashMap() {
        System.out.println("--------------------------");
        for (int index = 0; index < dataMap.length; index++) {
            System.out.println(index + " : ");
            Node tempNode = dataMap[index];
            while (!Objects.equals(tempNode, null)) {
                System.out.println(" {" + tempNode.key + "= " + tempNode.value + "} ");
                tempNode = tempNode.next;
            }
        }
    }

    public int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for (int index = 0; index < keyChars.length; index++) {
            int asciivalue = keyChars[index];
            hash = (hash + asciivalue * 23) % dataMap.length;
        }
        return hash;
    }

    public void set(String key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);
        if (Objects.equals(dataMap[index], null)) {
            dataMap[index] = newNode;
        } else {
            Node tempNode = dataMap[index];
            if (Objects.equals(tempNode.key, key)) {
                tempNode.value += value;
                return;
            }
            while (!Objects.equals(tempNode.next, null)) {
                tempNode = tempNode.next;
                if (Objects.equals(tempNode.key, key)) {
                    tempNode.value += value;
                    return;
                }
            }
            tempNode.next = newNode;
        }
    }

    public int get(String key) {
        int index = hash(key);
        Node tempNode = dataMap[index];
        while (!Objects.equals(tempNode, null)) {
            if (Objects.equals(tempNode.key, key)) return tempNode.value;
            tempNode = tempNode.next;
        }
        return 0;
    }

    public ArrayList allKeys() {
        ArrayList<String> allKeys = new ArrayList<>();
        for (Node node : dataMap) {
            Node temp = node;
            while (!Objects.equals(temp, null)) {
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allKeys;
    }
}
