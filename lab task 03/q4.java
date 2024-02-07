/*
You are given an interface AdvancedArithmetic which contains a method named
divisor_sum(int n). You need to write a class called MyCalculator which implements the interface.
Divisor_sum function just takes an integer as input and return the sum of all its divisors. For
example, divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. The value of n will be at
most 1000.
*/
import java.util.Scanner;
interface AdvancedArithmetic {
    int divisorSum(int n);
}
class MyCalculator implements AdvancedArithmetic {
        public int divisorSum(int n) { //piblic na dile error ase interface tai
        int sum = 0;
        for (int i=1;i<=n;i++) {
            if (n%i==0) {
                sum+=i;
            }
        }
        return sum;
    }
}

class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        MyCalculator myCalculator = new MyCalculator();
        int result = myCalculator.divisorSum(n);
        System.out.println("The sum of divisors of " + n + " is: " + result);
    }
}
