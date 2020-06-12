package main;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextFile implements FileIO {
    private String message;

    public TextFile(String message) {
        this.message = message;
    }
    
    public void Write (){
        try {
            PrintWriter a = new PrintWriter (new FileOutputStream ("Message.txt"));
            System.out.println("Write to text file");
            a.print(message);
            a.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public void Read (){
        try {
            Scanner a = new Scanner (new FileInputStream ("Message.txt"));
            System.out.println("Read from text file");
            while(a.hasNext()){
                System.out.println(a.nextLine());
            }
            a.close();
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}

