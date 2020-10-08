package Java_Collection;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        java.util.ArrayList<String> ar = new java.util.ArrayList<String>();
        ar.add("developer");
        ar.add("tester");
        ar.add("manager");
        ar.add("HR");

        //System.out.println(ar.get(2));
        ar.remove(3);

        for (String string : ar) {
            System.out.println(string);
        }

        java.util.ArrayList<Employee> emp = new java.util.ArrayList<Employee>();
        emp.add(new Employee("Hussain",27));
        emp.add(new Employee("Bob",25));
        emp.add(new Employee("Job",26));
        emp.add(new Employee("Alice",23));
        for (Employee employee : emp) {
            System.out.println(employee.name+" "+employee.age);
        }

    }
    static class Employee
    {
        String name;
        int age;
        public Employee(String name, int age)
        {
            this.name=name;
            this.age=age;
        }
    }
}
