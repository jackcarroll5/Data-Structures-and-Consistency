import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class MyRunnableAlt implements Runnable {

    private String filename;
    public MyRunnableAlt(String aFilename) {
        filename = aFilename;
    }

    @Override
    public void run() {
        int count = 0;
        try {
            Scanner in = new Scanner(new
                    FileInputStream(filename));
            while (in.hasNext()) { //while not at end of file
                in.next(); //get the next word from the file
                count++;
            }
        } catch (FileNotFoundException e) {
            System.out.println(filename + " not found!");
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Imp File: " + filename + ": " + count);
      }
    }
