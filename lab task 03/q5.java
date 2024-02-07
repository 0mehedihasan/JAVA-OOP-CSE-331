/*

*/
interface People {
    String getFirstName();
    String getLastName();
    void displayName();
}
class Student implements People {
    String firstName;
    String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void displayName() {
        System.out.println("Student info : " + getFirstName() + " " + getLastName());
    }
}

class Teacher implements People {
    String firstName;
    String lastName;

    public Teacher(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void displayName() {
        System.out.println("Teacher info: " + getFirstName() + " " + getLastName());
    }
}
class HelloWorld {
    public static void main(String[] args) {
        Student s1 = new Student("Mehedi", "Hasan");
        Teacher s2 = new Teacher("Hasan", "Mehedi");
        s1.displayName();
        s2.displayName();
    }
}
