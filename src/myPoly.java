abstract class Vehicle{
    abstract void go();


}

class Car2 extends Vehicle{

    @Override
    void go(){
        System.out.println("Your driving the car");
    }
}

class Bike extends Vehicle{

    @Override
    void go(){
        System.out.println("Your riding the bike");
    }
}

class Boat extends Vehicle{

    @Override
    void go(){
        System.out.println("Your sailing  the boat");
    }
}


public class myPoly {

    public static void main(String [] args){

        /*
        * Polymorphism = "POLY" = "MANY"
        *                "MORPH" = "SHAPE"
        *                objects can be identified as other objects
        *                Objects can be treated as objects of a common superclass
        * */
        Car2 car = new Car2();
        Boat boat = new Boat();
        Bike bike = new Bike();

       //car.go();
        //boat.go();
        //bike.go();

        //You can put all of the children in an array of the parent dtype
        Vehicle[] vehicles = {car, boat, bike};

        for(Vehicle vehicle : vehicles){

            vehicle.go();
        }

    }
}
