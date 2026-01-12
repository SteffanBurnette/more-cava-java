import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

public class Counter {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of seconds to count down from: ");
        int response = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){

            int count = response;
            @Override
            public void run(){

                System.out.println(count);
                count--;

                if(count <0){
                    System.out.println("HAPPY NEW YEAR");
                    timer.cancel();
                }

            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000);

    }
}
