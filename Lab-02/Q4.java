/*
4. Write a Java program to create a vehicle class hierarchy. The base class should be 

Vehicle, with child classes Truck, Car and Motorcycle. Each child class should have 

properties such as make, model, year, and fuel type. Implement methods for 

calculating fuel efficiency, distance traveled, and maximum speed.
*/

class Vehicle {
    String make;
    String model;
    int year;
    String fuelType;

    Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    void calculateFuelEfficiency() {
 
    }

    void calculateDistanceTraveled() {
        
    }

    void calculateMaxSpeed() {
 
    }
}

class Truck extends Vehicle {
    Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
}

class Car extends Vehicle {
    Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
}

class Motorcycle extends Vehicle {
    Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
}
class Mehedi {
    public static void main(String[] args) {
        Truck myTruck = new Truck("Ford", "F-150", 2022, "Diesel");
        Car myCar = new Car("Toyota", "Camry", 2023, "Gasoline");
        Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021, "Gasoline");

        myTruck.calculateFuelEfficiency();
        myCar.calculateDistanceTraveled();
        myMotorcycle.calculateMaxSpeed();
    }
}
