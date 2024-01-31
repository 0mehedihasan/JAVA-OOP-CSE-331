/*
Box class has length, width and height variables. Boxweight has weight as a 

member variable. Boxcolor has color variable. Shipment class has cost variable. 

Lastly, Received class has boxarrived variable. Create three constructors in all of 

the classes. You have to create instances of all of them in the main function.

*Use super in all the child classes.
*/
class Box {
    int length, width, height;

    Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
}

class BoxWeight extends Box {
    int weight;
    
    BoxWeight(int length, int width, int height, int weight) {
        super(length, width, height);
        this.weight = weight;
    }
}

class BoxColor extends BoxWeight {
    String color;
    
    BoxColor(int length, int width, int height, int weight, String color) {
        super(length, width, height, weight);
        this.color = color;
    }
}

class Shipment extends BoxColor {
    double cost;
    
    Shipment(int length, int width, int height, int weight, String color, double cost) {
        super(length, width, height, weight, color);
        this.cost = cost;
    }
}

class Received extends Shipment {
    boolean boxArrived;
    
    Received(int length, int width, int height, int weight, String color, double cost, boolean boxArrived) {
        super(length, width, height, weight, color, cost);
        this.boxArrived = boxArrived;
    }
}

class Mehedi {
    public static void main(String[] args) {
        Box box = new Box(10, 8, 6);
        BoxWeight boxWeight = new BoxWeight(12, 10, 8, 15);
        BoxColor boxColor = new BoxColor(15, 12, 10, 20, "Red");
        Shipment shipment = new Shipment(20, 15, 12, 25, "Blue", 50.0);
        Received received = new Received(25, 20, 15, 30, "Green", 75.0, true);

        System.out.println("Box: " + box.length + "  " + box.width + "  " + box.height);
        
        System.out.println("BoxWeight: " + boxWeight.length + "  " + boxWeight.width + "  " + boxWeight.height + ", Weight: " + boxWeight.weight);
        
        System.out.println("BoxColor: " + boxColor.length + "  " + boxColor.width + "  " + boxColor.height + ", Weight: " + boxColor.weight + ", Color: " + boxColor.color);
        
        System.out.println("Shipment: " + shipment.length + "  " + shipment.width + "  " + shipment.height + ", Weight: " + shipment.weight + ", Color: " + shipment.color + ", Cost: " + shipment.cost);
        
        System.out.println("Received: " + received.length + "  " + received.width + "  " + received.height + ", Weight: " + received.weight + ", Color: " + received.color + ", Cost: " + received.cost + ", Arrived: " + received.boxArrived);
    }
}
