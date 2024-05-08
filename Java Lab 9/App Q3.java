import java.util.Stack;
import java.util.Scanner;

class Mango {
    String name;

    Mango(String name) {
        this.name = name;
    }

    public String toString() {
        return "Mango: " + name;
    }
}

public class MangoStack {
    public static void main(String[] args) {
        Stack<Mango> mangoStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Options:");
            System.out.println("1. Insert another Mango");
            System.out.println("2. Delete the top Mango");
            System.out.println("3. Output the top Mango");
            System.out.println("4. Exit");
            System.out.print("Enter your option: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    if (mangoStack.size() < 5) {
                        System.out.print("Enter the Mango: ");
                        String mangoName = scanner.next();
                        mangoStack.push(new Mango(mangoName));
                    } else {
                        System.out.println("Stack is full. Cannot insert Mango.");
                    }
                    break;
                case 2:
                    if (!mangoStack.isEmpty()) {
                        Mango removedMango = mangoStack.pop();
                        System.out.println("Removed Mango: " + removedMango);
                    } else {
                        System.out.println("Stack is empty. Cannot delete Mango.");
                    }
                    break;
                case 3:
                    if (!mangoStack.isEmpty()) {
                        Mango topMango = mangoStack.peek();
                        System.out.println("Top Mango: " + topMango);
                    } else {
                        System.out.println("Stack is empty. No Mango to show.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose from 1 to 4.");
            }
        }
    }
}
