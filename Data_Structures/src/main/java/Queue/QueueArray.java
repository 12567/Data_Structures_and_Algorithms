package Queue;

public class QueueArray <T>{
    Object[] ArrayQueue;
    int rear;
    int front;
    int size;

    QueueArray(int size)
    {
        this.size=size;
        ArrayQueue=new Object[this.size];
        front=-1;
        rear=-1;
    }

    public boolean isFull()
    {
        return (rear==size-1);
    }

    public boolean isEmpty()
    {
        return (front==-1 || front>rear);
    }

    public void queueItem(Object newItem)
    {
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        rear=rear+1;
        ArrayQueue[rear]=newItem;
        if(front==-1)
            front=0;

    }

    public T deQueue()
    {
        if(isFull()){
            System.out.println("Queue is Empty");
            return null;
        }
        T ObjectOut= (T) ArrayQueue[front];
        front=front+1;
        return ObjectOut;
    }
}
