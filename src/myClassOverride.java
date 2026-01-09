class Animal2{

    void move(){
        System.out.println("This animal is running");
    }
}

class Dog2 extends Animal2{

}

class Cat2 extends Animal2{

    //method overriding
    @Override
    void move(){
        System.out.println("This fish is swimming");
    }
}

class Fish extends Animal2{

}

class Car{
    String make;
    String model;
    int year;
    String color;

    Car(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    //Overriding the toString method to have the class object output
    //informative information when trying to print said object
    @Override
    public String toString(){

        return this.color + " " + this.year + " " + this.make + " " + this.model;
    }
}


public class myClassOverride {
    public static void main(String [] args){

        Dog2 dog = new Dog2();
        Cat2 cat = new Cat2();
        Fish fish = new Fish();

        dog.move();
        fish.move();
        cat.move();

        Car car = new Car("Ford", "Mustang", 2025, "Red");
        System.out.println(car);


    }
}
