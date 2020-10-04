package Arrays;

public class OneDArray
{
    public static void main(String[] args) {
        int[] num = new int[5];
        num[0]=10;
        num[1]=20;
        num[2]=30;
        num[3]=40;
        num[4]=50;

        for(int x : num)
        {
            System.out.print(x+" ");
        }

        Student[] student = new Student[4];
        student[0]= new Student("Charlie",27);
        student[1]= new Student("Job", 30);
        student[2]= new Student("Bob", 29);
        student [3]= new Student("Alice", 25);
        System.out.println();
        System.out.println();
        System.out.println("-------------------");
        for(Student x : student)
        {
            System.out.println(x.name+"-->"+x.age);
        }
    }
}