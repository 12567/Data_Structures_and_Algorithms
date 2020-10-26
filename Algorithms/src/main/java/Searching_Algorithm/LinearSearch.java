package Searching_Algorithm;
public class LinearSearch {
    public static void main(String[] args) {
        DataSet data = new DataSet(1000);
        int search = 700;
        boolean isFound=false;


        for (int i = 0; i < data.getSize(); i++) {
            data.numberTry++;
            if(data.data[i] == search){
                System.out.println("Element is Found after : "+data.numberTry+" try");
                isFound=true;
                break;
            }
        }
        if(isFound == false)
        {
            System.out.println("Number is Not Found");
        }
    }
}
//TC: O(n)