/*
1. A class called MyPoint, which models a 2D point with x and y coordinates, is designed as shown
 Two instance variables x (int) and y (int).
 A default constructor that construct a point at the default location of (0, 0).
 An overloaded constructor that constructs a point with the given x and y coordinates.
 Getter and setter for the instance variables x and y.
 A method setXY() to set both x and y.
 A method getXY() which returns the x and y in a 2-element int array.
 A toString() method that returns a string description of the instance in the format "(x, y)".
 A method called distance(int x, int y) that returns the distance from this point to another
point at the given (x, y) coordinates
*/


class MyPoint {
    int x;
    int y;
    MyPoint() 
    {
        this(0, 0);
    }
    MyPoint(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }
    //Getter and setter for the instance variables x
    int getX() 
    {
        return x;
    }
    void setX(int x) {
        this.x = x;
    }
    //Getter and setter for the instance variables y
    int getY() 
    {
        return y;
    }
    void setY(int x) {
        this.y = y;
    }
    
    //A method getXY() which returns the x and y in a 2-element int array.
    
    void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int[] getXY() {
        return new int[]{x, y};
    }
    
    //A toString() method that returns a string description of the instance in the format "(x, y)".
    public String toString() 
    {
        return "("+x+","+y+")";
    }
    
    //A method called distance(int x, int y) that returns the distance from this point to another point at the given (x, y) coordinates
        double distance(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);//root sutro ta
    }


}

class HelloWorld {
    public static void main(String[] args) {
        MyPoint obj1 = new MyPoint();
        MyPoint obj2 = new MyPoint(3,4);
        System.out.println("First point: "+obj1);
        System.out.println("Second point: "+obj2);
        obj1.setXY(5,4);
        System.out.println("New point: "+obj1);
        System.out.println("Distance 1: "+obj1.distance(3,4));
    }
}
