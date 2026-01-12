import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;

public class myFiles {

    public static void main(String [] args){

        //How to write to a file

        //FileWriter - Good for small or medium-sized text files
        //BufferedWriter - Better performance for large amounts of text
        //PrintWriter - Best for structured data, like reports or logs
        //FileOutputStream - Best for binary files (e.g. images, audio files)


        //try-with-resources, automatically closes writer when done
        //Creates the file if it doesn't exist
        //Overwrites the file if it does exist
        try(FileWriter write = new FileWriter("data.txt")){
            write.write("This is my first line \n");
            write.write("This is my Second line \n");
            write.write("This is my FINAL line\n");
            System.out.println("File was successfully written to");

        }catch (FileNotFoundException e){
            System.out.println("ERROR:The file cannot be located.");
        }
        catch (IOException e){
            System.out.println("ERROR:Something went wrong");
        }

        //Appends to the file
        try(FileWriter writer = new FileWriter("data.txt", true)){
            writer.write("This line was added to the file\n");
            writer.write("This is the last line APPENDED to the file");
            System.out.println("File was successfully appended to");
        }catch (FileNotFoundException e){
            System.out.println("ERROR:The file cannot be located.");
        }
        catch (IOException e){
            System.out.println("ERROR:Something went wrong");
        }


        //3 Popular ways to read a file in java
        //BufferedReader + FileReader: Best for reading text files line-by-line
        //FileInputStream: Best for binary files (images, audio files)
        //RandomAccessFile: Best for read/write specific portions of a large file


        try(BufferedReader reader = new BufferedReader(new FileReader("data.txt"))){
            String contents = reader.readAllAsString();
            System.out.println(contents);
        }catch(FileNotFoundException e){
            System.out.println("ERROR: File not found");
        }
        catch(IOException e){
            System.out.println("ERROR: Something went wrong");
        }

        try(BufferedReader reader = new BufferedReader(new FileReader("data.txt"))){
            //Will read each line of the file one by one until the end is reached
            String line;
            int count = 1;
            while((line = reader.readLine()) != null){
                System.out.printf("This is line #%d: %s\n",count, line);
                count++;

            }
        }catch(FileNotFoundException e){
            System.out.println("ERROR: File not found");
        }
        catch(IOException e){
            System.out.println("ERROR: Something went wrong");
        }

    }
}
