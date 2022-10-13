
import java.util.*;
public class arrays1{
    public static void main( String []args){
        int marks[]=new int[100];
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println("physics="+marks[0]);
        System.out.println("chemisry="+marks[1]);
        System.out.println("math="+marks[2]);

        marks[2]=100;
        System.out.println("update math marks="+marks[2]);

        int persentege=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("persentege="+persentege+"%");
    }
}
