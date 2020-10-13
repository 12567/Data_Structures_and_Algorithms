package Stack;

import java.util.Arrays;

public class StackDArray<T> {
    Object[] ArrayStack;
    int size;
    int top;
    StackDArray(int size)
    {
        this.size=size;
        ArrayStack=new Object[this.size];
        top=-1;
    }

    public void push(Object newItem)
    {
        ensureCapacity(top+2);
        top=top+1;
        ArrayStack[top]= newItem;
    }
    public void ensureCapacity(int minCapacity)
    {
        int oldCapacity=getSize();

        if(minCapacity>oldCapacity)
        {
            int newCapacity=oldCapacity*2;
            if(newCapacity<minCapacity)
                newCapacity=minCapacity;
            ArrayStack=Arrays.copyOf(ArrayStack, newCapacity);
        }
    }

    public int getSize()
    {
        return ArrayStack.length;
    }


    public T pop()
    {
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return null;
        }
        T item=(T) ArrayStack[top];
        top=top-1;
        return item;
    }
    public boolean isEmpty()
    {
        return (top==-1);
    }

}
