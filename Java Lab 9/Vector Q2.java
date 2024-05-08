import java.util.Scanner;
import java.util.Vector;

class Room {
    double height;
    double width;
    double length;

    public Room(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public void display(Vector<Room> vector) {
        for (Room room : vector) {
            System.out.println("Height: " + room.height);
            System.out.println("Width: " + room.width);
            System.out.println("Length: " + room.length);
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Room> rooms = new Vector<>();

        // Input mechanism to create rooms
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter height for room " + (i+1) + ":");
            double height = scanner.nextDouble();
            System.out.println("Enter width for room " + (i+1) + ":");
            double width = scanner.nextDouble();
            System.out.println("Enter length for room " + (i+1) + ":");
            double length = scanner.nextDouble();

            Room room = new Room(height, width, length);
            rooms.add(room);
        }

        // Call the display method to show the rooms
        Room displayRoom = new Room(0, 0, 0); // Create an instance to access the display method
        displayRoom.display(rooms);
    }
}

