package Queue;

public class QueueLinkedList <T>{
    NodeD front;
    NodeD rear;

    public  QueueLinkedList() {
        rear = null;
        front = null;
    }

    public void queueItem(Object value) {
        NodeD newNode = new NodeD(value, null, null);
        if(rear == null || front == null){
            rear = newNode;
            front = newNode;
        }
        else
        {
            newNode.next = null;
            newNode.prev = rear;
            rear.next = newNode;
            rear = newNode;
        }
    }

    public T deQueue() {
        if(rear == null || front == null){
            System.out.println("Queue is Empty");
            return null;
        }
        T value = (T) front.value;
        front = front.next;
        if(front != null)
            front.prev = null;
        return value;
    }
}
