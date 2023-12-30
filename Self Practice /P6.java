import java.util.*;
class Voter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.printf("Enter Number=");
        num=input.nextInt();
        if(num%2==0)
        {
            System.out.printf("Even");
        }
        else
        {
            System.out.printf("Odd");
        }
    }
}

