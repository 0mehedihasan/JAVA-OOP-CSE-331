import java.util.*;
class Voter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int age;
        System.out.printf("Enter Age=");
        age=input.nextInt();
        if(age>=18)
        {
            System.out.printf("Congratulations,You are eligible to vote");
        }
        else
        {
            System.out.printf("Sorry,you are not eligible");
            int r=18-age;
            System.out.printf("\nAfter %d years you will be eligible ",r);
        }
    }
}
