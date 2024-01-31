/*
2. Write a Java program to create a class called Shape with methods called 

getPerimeter() and getArea(). Create a child class called Circle that uses the 

getPerimeter() and getArea() methods to calculate the area and perimeter of a circle.
*/
class Shape {
    double getPerimeter() {
        return 0;
    }

    double getArea() {
        return 0;
    }
}
class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    
    double getPerimeter() {
        return 2 * 3.1416 * radius;
    }
    double getArea() {
        return 3.1416 * radius * radius;
    }
}
 
class Mehedi {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Perimeter of the circle: " + circle.getPerimeter());
        System.out.println("Area of the circle: " + circle.getArea());
    }
}
