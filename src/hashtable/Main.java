package hashtable;

public class Main {
    public static void main(String[] args) {
        Hashtable myHashtable = new Hashtable();
        myHashtable.printHashMap();

        myHashtable.set("Ronaldo", 500);
        myHashtable.set("Messi", 700);
        myHashtable.set("Ronaldo", 300);
        myHashtable.set("Mbappe", 200);
        myHashtable.set("Pele", 600);
        myHashtable.set("Maradona", 100);
        myHashtable.set("Neymar", 250);
        myHashtable.set("Haaland", 250);
        myHashtable.printHashMap();

        System.out.println("Eusebio : " + myHashtable.get("Eusebio"));
        System.out.println("Ronaldo : " + myHashtable.get("Ronaldo"));
        System.out.println("Haaland " + myHashtable.get("Haaland"));

        System.out.println(myHashtable.allKeys());
    }
}
