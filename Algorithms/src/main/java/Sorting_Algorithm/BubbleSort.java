package Sorting_Algorithm;

public class BubbleSort {

    public static void bubbleSort(int[] arr)
    {
        int len = arr.length;
        int temp=0;

        for(int i=0; i<len; i++)
        {
            for (int j = 1; j < len-1; j++) {
                if(arr[j-1] > arr[j])
                {
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,50,30,10,60,80};
        System.out.println("Before Sorting :");
        for (int i : arr) {
            System.out.print(i+"\t");
        }

        System.out.println("\nAfter Sorting :");
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i+"\t");
        }
    }
}
