package TwoD_Array;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] data=new int[2][2];
        data[0][0]=2;
        data[0][1]=4;
        data[1][0]=6;
        data[1][1]=8;

        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                if(i==j)
                    System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }
    }
}
