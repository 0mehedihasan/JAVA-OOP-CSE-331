/*
Create a class named Football having data member radius and weight as integer type. A 

member function display() is used to show the values of radius and weight. A

parameterized constructor is used to initialize the values of radius and weight. If no value

is given while creating an object then, initialize the value of radius to 1 and weight to 2.

Now create two objects ob1(10,20) and ob2 and show the values of radius and weight of

the objects. Also mention the output.
*/

 class Football {
     int radius;
     int weight;
     
    Football(int radius, int weight) {
        this.radius = radius;
        this.weight = weight;
    }
    Football() {
        this.radius = 1;
        this.weight = 2;
    }
    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Weight: " + weight);
    }

    public static void main(String[] args) {
        Football ob1 = new Football(10, 20);
        System.out.println("Values of ob1:");
        ob1.display();
        
        Football ob2 = new Football();
        System.out.println("Values of ob2:");
        ob2.display();
    }
 }
