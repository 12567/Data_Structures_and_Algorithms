package Java_Collection;

public class Student implements Comparable{
    String name;
    int age;
    Student(String name, int age)
    {
        this.name=name;
        this.age=age;
    }



    @Override
    public int compareTo(Object obj) {
       Student o=(Student) obj;
        if(this.age==o.age)
            return 0;
        else if(this.age > o.age)
            return 1;
        else
            return -1;
    }
}