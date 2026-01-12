import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.LineUnavailableException;


public class myMusic {

    public static void main(String [] args){

        //Playing audio files in java
        //Supported file types: .wav, .au, .aiff

        String filePath = "/home/frentr/IdeaProjects/more-cava-java/src/Boogie Down - The Grey Room _ Golden Palms.wav";
        File file = new File(filePath);

        //Multiple resources in try-with-resources
        try(Scanner scan = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){


            //A clip is a audio player that allows you to load, play, pause and reset an audio
            //Gives you control over the audio
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            System.out.println("File successfully located");

            //Plays the audiofile
            //clip.start();

            String response = "";

            while(!response.equals("Q")){
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice: ");
                response = scan.next().toUpperCase();


                //Enhance switch block that executes logic based on the users response
                switch(response){

                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0); //Resets the audio file
                    case "Q" -> clip.close();
                    default -> System.out.println("Incorrect input, please try again");
                };


            }


        }catch(FileNotFoundException e){
            System.out.println("ERROR: File not found");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("ERROR: Audio File type not supported");

        }
        catch(LineUnavailableException e){
            System.out.println("ERROR: Unable to access audio resource");

        }
        catch(IOException e){
            System.out.println("ERROR: Something went wrong");
        }
        finally{
            System.out.println("GoodBYE");

        }

    }
}
