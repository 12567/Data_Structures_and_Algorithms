package Searching_Algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        DataSet data = new DataSet(1000);
        int search = 7000;
        boolean isFound=false; 
        int low = 0;
        int high = data.getSize()-1; 
        int mid = 0;

        while(!isFound)
        {
            if(low > high)
            {
                System.out.println("Element is not found");
                break;
            }
            mid = low+((high - low)/2);
            data.numberTry++;
            if(data.data[mid] == search)
            {
                System.out.println("Element is Found after :"+data.numberTry+" try");
                break;
            }

            if(data.data[mid] < search)
            {
                low = mid+1;
            }
            if(data.data[mid] > search)
            {
                high = mid-1;
            }
        }
    }
}
//TC: O(log n)
