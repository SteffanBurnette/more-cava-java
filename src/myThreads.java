import java.util.Scanner;

class MyRunnable implements Runnable{

    @Override
    public void run(){
        for(int i = 0; i <= 5; i++){
            try {
                //Refers to the current thread that we are working with
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Thread was interrupted");
            }
            if(i ==5){
                System.out.println("Times up");
                //Ends all programs once time is up
                System.exit(0);
            }
        }
    }
}

public class myThreads {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("You have 5 seconds to enter your name.");
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        //The thread will end once the main thread is finished executing
        thread.setDaemon(true);
        thread.start();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, it is nice to meet you " + name);

        scanner.close();
    }
}
