package Queue;

import java.util.Arrays;

public class QueueDArray<T> {
    Object[] ArrayQueue;
    int rear;
    int front;
    int size;

    QueueDArray(int size)
    {
        this.size=size;
        ArrayQueue=new Object[this.size];
        front=-1;
        rear=-1;
    }



    public void queueItem(Object newItem)
    {
        ensureCapacity(rear+2);
        rear=rear+1;
        ArrayQueue[rear]=newItem;
        if(front==-1)
            front=0;

    }
    public void ensureCapacity(int minCapacity)
    {
        int oldCapacity=getSize();

        if(minCapacity>oldCapacity)
        {
            int newCapacity=oldCapacity*2;
            if(newCapacity<minCapacity)
                newCapacity=minCapacity;
            ArrayQueue=Arrays.copyOf(ArrayQueue, newCapacity);
        }
    }
    public int getSize()
    {
        return ArrayQueue.length;
    }

    public T deQueue()
    {

        T ObjectOut= (T) ArrayQueue[front];
        front=front+1;
        return ObjectOut;
    }
}
