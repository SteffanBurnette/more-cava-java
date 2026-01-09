

class Circle extends Shape{

    //Inheriting and defining the abstract method
    @Override
     double area(){

         return 0.0;
     }

}

class Triangle extends Shape{
    //Inheriting and defining the abstract method
    @Override
    double area(){

        return 0.0;
    }

}

class Rectangle extends Shape{
    //Inheriting and defining the abstract method
    @Override
    double area(){

        return 0.0;
    }

}

public class myAb {

    public static void main(String [] args){

        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

        circle.display();
        triangle.display();
        rectangle.display();



    }
}
