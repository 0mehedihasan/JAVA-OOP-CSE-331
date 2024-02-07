/*
1. Create an Abstract class Student that contains a method take_exam(), implement the method
in the child classes PhdStudent and GradStudent in which PhdStudent takes exam by giving his
final defense presentation while the graduate student gives a written paper.
*/

abstract class Student
{
    abstract void take_exam();
}
class PhdStudent extends Student
{
    void take_exam()
    {
        System.out.println("PhdStudent takes exam by giving his final defense presentation");
    }
}
class GradStudent extends Student
{
    void take_exam()
    {
        System.out.println("GradStudent takes exam by giving his final defense a written paper.");
    }
}
class HelloWorld {
    public static void main(String[] args) {
        PhdStudent s1 = new PhdStudent();
        GradStudent s2 = new GradStudent();
        s1.take_exam();
        s2.take_exam();
    }
}
