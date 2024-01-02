
import java.util.*;
class Array {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       
        int [] num=new int[10];
       
        for(int i=0;i<3;i++)
        {
            System.out.printf("Enter %dth value:",i);
            num[i]=input.nextInt();
        }
        //int len=num.length;
        int max=num[0];
        int min=num[0];
        for(int k=1;k<3;k++)
        {
            if(max<num[k])
            {
                max=num[k];
            }
            if(max>num[k])
            {
               min=num[k];
            }
            
        }
        System.out.printf("Max:%d\n",max);
        System.out.printf("Min:%d",min);
    }
}
