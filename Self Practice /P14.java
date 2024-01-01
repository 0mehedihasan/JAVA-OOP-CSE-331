
import java.util.*;
class PrimeNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int first=0;
        int second=1;
        int num,fibo;
        System.out.printf("Enter Number:");
        num=input.nextInt();
        System.out.printf("Series =%d %d ",first,second);
        for(int i=3;i<=num;i++)
        {
           fibo=first+second;
           System.out.printf("%d ",fibo);
           first=second;
           second=fibo;
        }
    }
}
