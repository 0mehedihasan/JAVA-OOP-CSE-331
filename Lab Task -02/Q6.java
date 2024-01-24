/*
You and your friends are going to order food from FoodPanda. You have to choose your

food items. You are asked to write a function called Orderfood () which takes the name of

foods and number of items as the arguments. The name and number of food items may

vary from two to four and from person to person. Complete the task using function

overloading concept.
*/
 class FoodOrder {

     void OrderFood(String dish1, int quantity1, String dish2, int quantity2) {
        System.out.println("Order: " + quantity1 + " " + dish1 + " and " + quantity2 + " " + dish2 + ".");
    }

     void OrderFood(String dish1, int quantity1, String dish2, int quantity2, String dish3, int quantity3) {
        System.out.println("Order: " + quantity1 + " " + dish1 + ", " + quantity2 + " " + dish2 + ", and "
                + quantity3 + " " + dish3 + ".");
    }

     void OrderFood(String dish1, int quantity1, String dish2, int quantity2, String dish3, int quantity3,
            String dish4, int quantity4) {
        System.out.println("Order: " + quantity1 + " " + dish1 + ", " + quantity2 + " " + dish2 + ", "
                + quantity3 + " " + dish3 + ", and " + quantity4 + " " + dish4 + ".");
    }

    public static void main(String[] args) {
        FoodOrder foodOrder = new FoodOrder();

        foodOrder.OrderFood("Shorshe Ilish", 2, "Chingri Malai Curry", 3);
        foodOrder.OrderFood("Dhokar Dalna", 1, "Aloo Posto", 2, "Shorshe Bhapa Chingri", 1);
        foodOrder.OrderFood("Kosha Mangsho", 1, "Shorshe Bata Diye Macher Jhol", 2, "Mishti Doi", 4, "Rasgulla", 2);
    }
 }
