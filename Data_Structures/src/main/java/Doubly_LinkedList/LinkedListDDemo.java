package Doubly_LinkedList;

public class LinkedListDDemo {
    public static void main(String[] args) {
        LinkedListD<String> list=new LinkedListD<String>();
        list.add("Charlie");
        list.add("Joe");
        list.add("Job");
        list.add("Bob");
        list.add("Alice");
        System.out.println("Before Delete");
        list.display();
        list.delete();
        System.out.println("\nAfter Delete");
        list.display();
    }
}

