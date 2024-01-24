/*
Create a class called Palindrome. This class must include one integer variable, one 

getInput () function, and one isPallindrome() function. Your task is to take an integer input 

from the keyboard and check whether it is palindrome or not. Create necessary 

constructors.
*/

import java.util.Scanner;

class Palindrome {
    int number;
     Palindrome() {
        number = 0;
     }
    void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        this.number = scanner.nextInt();
    }
    boolean isPalindrome() {
        int originalNumber =number;
        int reversedNumber = 0;
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            originalNumber /= 10;
        }

        return number == reversedNumber;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        palindrome.getInput();

        if (palindrome.isPalindrome()) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}
