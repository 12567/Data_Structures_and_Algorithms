package Queue;

public class QueueDArrayDemo {
    public static void main(String[] args) {
        QueueDArray<Integer> q=new QueueDArray<Integer>(2);
        q.queueItem(5);
        q.queueItem(10);
        System.out.println("Queue Size:"+q.getSize());
        q.queueItem(15);
        q.queueItem(20);
        System.out.println("Queue Size:"+q.getSize());
        q.queueItem(20);
        System.out.println("Queue Size:"+q.getSize());
        q.deQueue();
        System.out.println("Queue Size:"+q.getSize());

    }
}
