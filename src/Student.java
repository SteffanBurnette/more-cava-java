public class Student extends Person{

    double gpa;

    Student(String first, String last, double gpa){
        //Using super to get the functionality from the parent class "Person"
        //the super keyword just refers to the parent
        super(first, last);
        this.gpa = gpa;

    }
}
