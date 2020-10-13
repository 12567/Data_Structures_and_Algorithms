package Stack;

public class StackDArrayDemo {
    public static void main(String[] args) {
        StackDArray<Integer> st=new StackDArray<>(2);
        st.push(10);
        st.push(20);
        System.out.println("Stack Size:"+st.getSize());
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println("Stack Size:"+st.getSize());
        st.push(60);
        System.out.println(st.pop());
        System.out.println(st.pop());
        st.push(70);
        while(!st.isEmpty())
        {
            System.out.println(st.pop());
        }
        st.pop();
    }
}
