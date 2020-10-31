package Interview_Problems;

public class Knapsack {
   public static void main(String[] args) {
    
    int[] set = {1,5,6,9,10};
    int myBasket = 10;

    
    for (int i = 0; i < (1 << set.length); i++) {
        //System.out.println(i);
        //System.out.println(Integer.toBinaryString(i));
        String packet="";
        int sum=0;
        for (int j = 0; j < set.length; j++) {
            //System.out.println(Integer.toBinaryString(1<<j));
            if((i & (1<<j)) > 0)
            {
                packet = packet + set[j] +" "; 
                sum = sum + set[j];
            }
        }
        if (sum == myBasket) {
            System.out.println(packet);
        }   
    } 
  }
}
