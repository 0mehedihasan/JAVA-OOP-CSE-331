
import java.util.*;
class Array {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       
        int [] num=new int[10];
       
        for(int i=0;i<5;i++)
        {
            System.out.printf("Enter %dth value:",i);
            num[i]=input.nextInt();
        }
        int len=num.length;
        for(int k=0;k<len;k++)
        {
            System.out.printf("%d\t",num[k]);
        }
    }
}

