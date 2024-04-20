class Pizza {
    // instance variables
    String size;
    int cheeseToppings;
    int pepperoniToppings;
    int pineappleToppings;

    // constructor
    public Pizza(String size, int cheeseToppings, int pepperoniToppings, int pineappleToppings) {
        this.size = size;
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.pineappleToppings = pineappleToppings;
    }

    // method to calculate cost
    public double calcCost() {
        double baseCost;
        switch (size) {
            case "small":
                baseCost = 10;
                break;
            case "medium":
                baseCost = 12;
                break;
            case "large":
                baseCost = 14;
                break;
            default:
                baseCost = 0; // default to 0 if size is not recognized
        }
        return baseCost + 2 * (cheeseToppings + pepperoniToppings + pineappleToppings);
    }

    // method to get description
    public String getDescription() {
        return "Size: " + size + ", Cheese Toppings: " + cheeseToppings +
               ", Pepperoni Toppings: " + pepperoniToppings +
               ", Pineapple Toppings: " + pineappleToppings;
    }

    // getter and setter methods
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCheeseToppings() {
        return cheeseToppings;
    }

    public void setCheeseToppings(int cheeseToppings) {
        this.cheeseToppings = cheeseToppings;
    }

    public int getPepperoniToppings() {
        return pepperoniToppings;
    }

    public void setPepperoniToppings(int pepperoniToppings) {
        this.pepperoniToppings = pepperoniToppings;
    }

    public int getPineappleToppings() {
        return pineappleToppings;
    }

    public void setPineappleToppings(int pineappleToppings) {
        this.pineappleToppings = pineappleToppings;
    }
}

public class Main {
    public static void main(String[] args) {
        // Example usage
        Pizza pizza = new Pizza("medium", 1, 2, 0);
        System.out.println("Cost: $" + pizza.calcCost());
        System.out.println("Description: " + pizza.getDescription());
    }
}
