/*
Write a program that creates a base class called num. This class holds an integer 

value and contain a function called shownum(). Create two derived classes called 

outhex and outoct that inherit num. This classes must have to override shownum() 

so that it displays the value in hexadecimal and octal, respectively.
*/

class Num {
    int value;

    Num(int value) {
        this.value = value;
    }

    void showNum() {
        System.out.println("Decimal value: " + value);
    }
}

class OutHex extends Num {
    OutHex(int value) {
        super(value);
    }
    void showNum() {
        System.out.println("Hexadecimal value: " + Integer.toHexString(value));
    }
}

class OutOct extends Num {
    public OutOct(int value) {
        super(value);
    }

    void showNum() {
        System.out.println("Octal value: " + Integer.toOctalString(value));
    }
}

class Mehedi {
    public static void main(String[] args) {
        Num decimalNum = new Num(42);
        OutHex hexNum = new OutHex(42);
        OutOct octNum = new OutOct(42);

        decimalNum.showNum();
        hexNum.showNum();
        octNum.showNum();
    }
}
