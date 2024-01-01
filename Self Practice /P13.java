
import java.util.*;
class PrimeNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num,count=0;
        System.out.printf("Enter a number :");
        num=input.nextInt();
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                count++;
                break;
            }
        }
        if(count==0)
        {
            System.out.println(num+"\tIs a prime number");
        }
        else
        {
          System.out.println(num+"\tIs not a prime number"); 
        }
        
    }
}


