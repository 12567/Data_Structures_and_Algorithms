package Java_Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("developer");
        list.add("Manager");
        list.add("tester");

        Iterator<String> itr=list.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
