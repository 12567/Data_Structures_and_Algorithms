package Sorting_Algorithm;

public class MergeSort
{
    int[] array;
    int[] tempArray;

    void prepaareForSort(int[] arr)
    {
        this.array = arr;
        this.tempArray = new int[arr.length];
        doMergeSort(0,arr.length-1);
    }

    void doMergeSort(int lowerIndex, int higherIndex)
    {
        if(lowerIndex < higherIndex)
        {
            int mid = lowerIndex + (higherIndex - lowerIndex)/2;
            doMergeSort(lowerIndex, mid); //ex. (1-5)
            doMergeSort(mid+1, higherIndex); //ex. (6-10)
            mergePart(lowerIndex, mid, higherIndex);

        }
    }
    
    private void mergePart(int lowerIndex, int mid, int higherIndex) {
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempArray[i] = array[i];
        }
        int i = lowerIndex;
        int j = mid+1;
        int k = lowerIndex;

        while(i <= mid && j <= higherIndex)
        {
            if (tempArray[i] <= tempArray[j]) {
                array[k] = tempArray[i];
                i++;   
            }
            else
            {
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }

        while (i<= mid) {
            array[k] = tempArray[i];
            k++;
            i++;
        }
    }

    public static void main(String[] args) {
       int[] arr = {1,50,30,10,60,80};
      
       System.out.println("Before Sorting :");
        for (int i : arr) {
           System.out.print(i+"\t");
        }
        
        new MergeSort().prepaareForSort(arr);
       
        System.out.println("\nAfter Sorting :");
        for (int i : arr) {
        System.out.print(i+"\t");
        } 
    }
}