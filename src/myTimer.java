import java.util.Timer;
import java.util.TimerTask;

public class myTimer {

    public static void main(String [] args){

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){

             int count = 3;
            @Override
            public void run(){
                System.out.println("Hello!");

                count--;
                if(count <=0){
                    System.out.println("Task complete");
                    //Terminates this timer, discarding any currently scheduled tasks
                    timer.cancel();
                }
            }
        };
        //Task, delay to execute task (3000 milliseconds == 3 seconds)
        //Task - The code to be executed
        //delay - The amount of time to wait before executing the code
        //period - The amount of time in between repeating the task execution
        timer.schedule(task, 3000, 1000);


    }
}
