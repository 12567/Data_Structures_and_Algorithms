package Queue;

public class QueueLinkedListDemo {
    public static void main(String[] args) {
        QueueLinkedList<Integer> q=new QueueLinkedList<Integer>();
        q.queueItem(10);
        q.queueItem(20);
        q.queueItem(30);
        q.queueItem(40);

        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());


    }
}
