 class Address {
     String street;
     String city;

     Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String toString() {
        return street + ", " + city ;
    }
}

class Person {
     String name;
     int age;
     Address address;

     Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String toString() {
        return name + ", " + age + ", " + address.toString();
    }
}
class HelloWorld {
    public static void main(String[] args) {
        Address address = new Address("Mirpur", "Dhaka");
        Person person = new Person("Mehedi", 22, address); //passed values
        System.out.println(person.toString());
    }
}
