//sum of digits and reverse no
import java.util.*;
class Digit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        int sum=0;
        int temp;
        int tempo;
        int rem;
        int rema;
        int rev=0;
        
        System.out.printf("Enter Number:");
        num=input.nextInt();
        temp=num;
        while(temp!=0)
        {
            rem=temp%10;
            sum=sum+rem;
            temp=temp/10;
        }
        System.out.println("Sum of digits="+sum);
        tempo=num;
        while(tempo!=0)
        {
            rema=tempo%10;
            rev=rev*10+rema;
            tempo=tempo/10;
        }
        System.out.println("\nReverse No. the number="+rev);
    }
}

