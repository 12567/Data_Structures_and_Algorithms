package Interview_Problems;

import java.util.ArrayList;
import java.util.Collections;

//sort an array of Objects
class Person implements Comparable<Person>
{
    String name;
    int age;

    Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    @Override
    public int compareTo(Person o) {
        return o.age - this.age;//decendinding
        //return this.age - o.age;//acending
    }
}
public class SortApp {
        public static void main(String[] args) {
        ArrayList<String> listOfNames=new ArrayList<String>();
        listOfNames.add("Job");
        listOfNames.add("Bob");
        listOfNames.add("Alice");
        listOfNames.add("Charlie");
        System.out.println("Before Sorting");
        print(listOfNames);
        Collections.sort(listOfNames);
        System.out.println("After Sorting");
        print(listOfNames);

        ArrayList<Person> listOfPerson=new ArrayList<Person>();
        listOfPerson.add(new Person("Job", 27));
        listOfPerson.add(new Person("Bob", 25));
        listOfPerson.add(new Person("Alice", 31));
        listOfPerson.add(new Person("Charlie", 29));
        Collections.sort(listOfPerson);
        printPerson(listOfPerson);
    }
    public static void printPerson(ArrayList<Person> listOfPerson)
    {
        
        for(Person person: listOfPerson)
        {
            System.out.println("Name :"+person.name);
            System.out.println("Age :"+person.age);
        }
    }

    public static void print(ArrayList<String> listOfNames)
    {
        
        for(String name: listOfNames)
        {
            System.out.println(name);
        }
    }

}
