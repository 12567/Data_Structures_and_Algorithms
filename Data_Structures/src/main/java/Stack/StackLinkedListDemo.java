package Stack;

public class StackLinkedListDemo {
    public static void main(String[] args) {
        StackLinkedList<Integer> st= new StackLinkedList<>();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.pop());
        System.out.println(st.pop());
        st.push(70);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        st.push(70);
    }
}
