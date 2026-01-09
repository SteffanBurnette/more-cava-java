class Rabbit implements Prey{

    @Override
    public void flee(){

        System.out.println("The rabbot is fleeing");
    }

}

class Hawk implements Predator{

    @Override
    public void hunt(){
        System.out.println("The hawk is hunting");
    }

}

//One key difference between abstract classes and interfaces is that
//one class can implement multiple interfaces
class Fish2 implements Prey, Predator{

    @Override
    public void hunt(){
        System.out.println("The fish is hunting");
    }

    @Override
    public void flee(){
        System.out.println("The fish is fleeing");
    }

}



public class myPred {

    public static void main(String [] args){

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish2 fish = new Fish2();

        rabbit.flee();
        hawk.hunt();
        fish.hunt();
        fish.flee();


    }
}
