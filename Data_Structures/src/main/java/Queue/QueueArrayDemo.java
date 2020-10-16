package Queue;

public class QueueArrayDemo {
    public static void main(String[] args) {
        QueueArray<Integer> q=new QueueArray<Integer>(5);
        q.queueItem(5);
        q.queueItem(4);
        q.queueItem(7);
        q.queueItem(8);


        System.out.println("Dequeue:"+q.deQueue());
        System.out.println("Dequeue:"+q.deQueue());
        System.out.println("Dequeue:"+q.deQueue());
    }
}
