package Stack;

public class StackArrayDemo {
    public static void main(String[] args) {
        StackArray<Integer> st=new StackArray<>(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
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
