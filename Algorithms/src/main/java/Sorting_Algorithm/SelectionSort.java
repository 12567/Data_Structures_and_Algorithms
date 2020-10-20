package Sorting_Algorithm;

public class SelectionSort {
    public static void selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            int index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            if(index != i)
            {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,50,30,10,8,80};
        System.out.println("Before Sorting :");
        for (int i : arr) {
            System.out.print(i+"\t");
        }

        System.out.println("\nAfter Sorting :");
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i+"\t");
        }
    }
}
