/*
3. Suppose there is an animal class which must be inherited by Man, Dog and Bird
classes. Every animal has Eyes. Eyes can be blue colored or brown. A person may
have a car whereas dog or Bird cannot have a car. Implement the scenario using
JAVA.
*/
class Animal {
    String eyesColor;

    Animal(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public String getEyesColor() {
        return eyesColor;
    }
}

class Man extends Animal {
    private String car;

    public Man(String eyesColor, String car) {
        super(eyesColor);
        this.car = car;
    }

    public String getCar() {
        return car;
    }
}

class Dog extends Animal {
    Dog(String eyesColor) {
        super(eyesColor);
    }
}

class Bird extends Animal {
    Bird(String eyesColor) {
        super(eyesColor);
    }
}

class HelloWorld {
    public static void main(String[] args) {
        Man man = new Man("brown", "alien");
        Dog dog = new Dog("blue");
        Bird bird = new Bird("brown");

        System.out.println("Man eyes color: " + man.getEyesColor());
        System.out.println("Man car: " + man.getCar());

        System.out.println("Dog eyes color: " + dog.getEyesColor());

        System.out.println("Bird eyes color: " + bird.getEyesColor());
    }
}
