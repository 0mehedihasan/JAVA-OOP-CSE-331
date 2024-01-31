/*
Write a Java program to create a class known as Person with methods called 

getFirstName() and getLastName(). Create a child class called Employee that adds 

a new method named getEmployeeId() and accesses the getLastName() method to 

include the employee's job title.
*/

class Person {
    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}

class Employee extends Person {
    public double employeeId;
    public String jobTitle;

    public Employee(String firstName, String lastName, double employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public double getEmployeeId() {
        return this.employeeId;
    }
    public String getLastName() {
        return this.lastName + ", " + jobTitle;
    }
}
class Mehedi {
    public static void main(String[] args) {
        Person person = new Person("Mehedi", "Hasan");
        System.out.println("Person: " + person.getFirstName() + " " + person.getLastName());

        Employee employee = new Employee(" nd Mehedi", "Hasan ", 21225103334.0, "Software Engineer");
        System.out.println("Employee: " + employee.getFirstName() + " " + employee.getLastName() +
                ", Employee ID: " + employee.getEmployeeId() + ", Job Title: " + employee.jobTitle);
    }
}
