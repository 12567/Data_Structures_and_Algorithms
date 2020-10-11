package Java_Collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
        System.out.println("Basic Queue");
        Queue<Integer> q = new LinkedList<>();
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);

        System.out.println(q.poll());

        System.out.println("Priority Queue");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(44);
        pq.add(33);
        pq.add(19);
        pq.add(22);

        System.out.println(pq.poll());
        System.out.println("Priority Queue For Students");
        PriorityQueue<Student> pq1 = new PriorityQueue<Student>();
        pq1.add(new Student("Andre", 25));
        pq1.add(new Student("Alice", 21));
        pq1.add(new Student("Bob", 30));
        pq1.add(new Student("Job", 23));

        System.out.println(pq1.poll().name);
    }
}
