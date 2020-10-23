package Sorting_Algorithm;

public class HeapSort {
    static int total;
    
    static void heapify(Comparable[] arr, int i)
    {
        int left = i*2;
        int right = i*2+1;
        int grt = i;

        if(left <= total && arr[left].compareTo(arr[grt]) >= 0)
            grt=left;
        if(right <= total && arr[right].compareTo(arr[grt]) >= 0)
            grt=right;
        if(grt != i)
        {
            swap(arr, i, grt);
            heapify(arr, grt);
        }
    }
    
    static void swap(Comparable[] arr, int i, int grt) {
        Comparable temp = arr[i];
        arr[i] = arr[grt];
        arr[grt] = temp;
    }

    static void sort(Comparable[] arr)
    {
        total = arr.length-1;
        for (int i = total/2; i >= 0; i--) {
            heapify(arr, i);
        }
        for (int i = total; i > 0; i--) {
            swap(arr, 0, i);
            total--;
            heapify(arr, 0);
        }

    }

    public static void main(String[] args) {
        Integer[] arr = {1,50,30,10,60,80,20};
      
       System.out.println("Before Sorting :");
        for (int i : arr) {
           System.out.print(i+"\t");
        }
        
        sort(arr);
       
        System.out.println("\nAfter Sorting :");
        for (int i : arr) {
        System.out.print(i+"\t");
        }
    }
}
