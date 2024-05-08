import java.util.Vector;
class Student {
    int ID;
    String name;
    double cgpa;
    
    Student() {
        ID =0;
        name = null;
        cgpa = 0;
    }
    Student(int ID, String name, double cgpa) {
        this.ID = ID;
        this.name = name;
        this.cgpa = cgpa;
    }
    

    void display(Vector<Student> studentVector) {
        System.out.println("Students with CGPA over 3.5:");
        for (Student student : studentVector) {
            if (student.cgpa> 3.5) {
                System.out.println("ID  :"+student.ID);
                System.out.println("Name:"+student.name);
                System.out.println("CGPA:"+student.cgpa);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Vector<Student> studentVector = new Vector<>();

        Student student1 = new Student(2122510334, "Mehedi", 3.8);
        Student student2 = new Student(2122510338, "Faiza", 3.2);
        Student student3 = new Student(2122510341, "Anim", 3.2);

        studentVector.add(student1);
        studentVector.add(student2);
        studentVector.add(student3);

        Student student = new Student();
        student.display(studentVector);
    }
}
