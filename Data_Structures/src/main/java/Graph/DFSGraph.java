package Graph;

import java.util.Stack;

public class DFSGraph {
   int size;
   AdjList[] array;

   public DFSGraph(int size)
   {
        this.size = size;
        array = new AdjList[this.size];
        for (int i = 0; i < size; i++) {
           array[i] = new AdjList();
           array[i].head = null;
        }
   }

   public void add(int src, int dest)
   {
      Node n = new Node(dest, null);
      n.next = array[src].head;
      array[src].head = n;
   }

   public void DFSExplore(int startVertex)
   {
      Boolean[] visited = new Boolean[size];
      for (int i = 0; i < size; i++) 
         visited[i] = false;
      Stack<Integer> s = new Stack<Integer>();
      s.push(startVertex);
      while(!s.isEmpty())
      {
         int n = s.pop();
         s.push(n);
         visited[n] = true;
         Node head = array[n].head;
         Boolean isDone = true; 
         while (head != null) {
            if (visited[head.value] == false) {
               s.push(head.value);
               visited[head.value] = true;
               isDone = false;
               break;
            }
            else{
               head = head.next;
            }
         }
         if (isDone == true) {
            int out = s.pop();
            System.out.println("Visited nodde :"+out);
         }
      }
   }
}
