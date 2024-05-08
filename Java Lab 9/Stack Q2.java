import java.util.Scanner;
import java.util.Stack;

class Room {
    double height;
    double width;
    double length;
    
    Room()
    {
        height = 0;
        width = 0;
        length = 0;
    }
    
    Room(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public void display(Stack<Room> stack) {
        System.out.println("Before size: " + stack.size()); 
        while (!stack.isEmpty()) {
            Room room = stack.pop();
            System.out.println("Height: " + room.height);
            System.out.println("Width: " + room.width);
            System.out.println("Length: " + room.length);
            System.out.println();
        }
        System.out.println("After size: " + stack.size()); 
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Room> rooms = new Stack<>();
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter height for room " + (i+1) + ":");
            double height = scanner.nextDouble();
            System.out.println("Enter width for room " + (i+1) + ":");
            double width = scanner.nextDouble();
            System.out.println("Enter length for room " + (i+1) + ":");
            double length = scanner.nextDouble();

            Room room = new Room(height, width, length);
            rooms.push(room);
        }
        Room r1 = new Room();
        r1.display(rooms);
    }
}
