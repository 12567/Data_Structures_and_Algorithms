package Java_Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        //TreeSet<String> set=new TreeSet<>();//gives output in Sorted order
        set.add("Mohsin");
        set.add("Hussain");
        set.add("Asghar");
        set.add("Akbar");

        Iterator<String> itr=set.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        //printing set using enhanced for loop
       /* for (String s : set) {
            System.out.println(s);
        }*/

    }
}
