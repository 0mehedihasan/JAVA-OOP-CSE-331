/*Create a class called Reverse. This class must include one integer variable, one getInput ()

function, and one doReverse() function. Your task is to take an integer input from the 

keyboard using the getInput() function and reverse it through doReverse() function. Create 

necessary constructors.*/

import java.util.Scanner;

class Reverse {
     int number;
    Reverse() {
        number = 0;
    }
     void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        number = scanner.nextInt();
    }
     void doReverse() {
        int reversedNumber = 0;
        int originalNumber =number;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            originalNumber /= 10;
        }

        System.out.println("Reversed number: " + reversedNumber);
    }

    public static void main(String[] args) {
        Reverse ob = new Reverse();
        ob.getInput();
        ob.doReverse();
    }
