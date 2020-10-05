package Dynamic_Array;
public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray<Integer> data=new DynamicArray<Integer>();
        data.put(10);
        System.out.println("Size :"+data.getSize());
        data.put(20);
        System.out.println("Size :"+data.getSize());
        data.put(30);
        System.out.println("Size :"+data.getSize());
        data.put(40);
        System.out.println("Size :"+data.getSize());

        System.out.println("Elements ssaved in Array:");
        for(int i=0; i<data.getSize();i++)
        {
            System.out.print(data.get(i)+" ");
        }
    }
}
