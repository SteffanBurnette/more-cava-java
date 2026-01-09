public class myMain {

    public static void main(String [] args){

        Person person = new Person("Tom", "Riddle");
        person.showName();

        //Initializing a child class that uses super
        Student student = new Student("Harry", "Potter", 3.2);
        student.showName();

    }
}
