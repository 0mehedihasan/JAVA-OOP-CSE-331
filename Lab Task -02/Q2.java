/*
Create a class named Complex that must have two integer data members (real, and imag). 

Create two constructors, one Read function to take keyboard input, one Add (return object), 

function, and one Display function to print results. The Add function must take one object 

as an argument. Watch the input and output section for better understanding.

Input

Enter real and imaginary numbers respectively: 16 7

Enter real and imaginary numbers respectively: 5 8

 Output:

Sum = 21 + 15i

  */

import java.util.Scanner;
class Complex {
     int real;
     int imag;

    Complex() {
        real = 0;
        imag = 0;
    }

    Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

     static Complex read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter real part: ");
        int real = scanner.nextInt();
        System.out.print("Enter imaginary part: ");
        int imag = scanner.nextInt();
        return new Complex(real, imag);
    }

     Complex add(Complex other) {
        int resultReal = this.real + other.real;
        int resultImag = this.imag + other.imag;
        return new Complex(resultReal, resultImag);
    }

    void display() {
        System.out.println("Sum = " + this.real + " + " + this.imag + "i");
    }

    public static void main(String[] args) {
        System.out.println("Enter first value:");
        Complex complex1 = Complex.read();

        System.out.println("Enter Second Value:");
        Complex complex2 = Complex.read();

        Complex sum = complex1.add(complex2);

        System.out.println("Output:");
        sum.display();
    }
}
