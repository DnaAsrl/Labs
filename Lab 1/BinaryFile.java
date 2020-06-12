/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.*;

/**
 *
 * @author Dina
 */
public class BinaryFile {
    private String message;

    public BinaryFile(String message) {
        this.message = message;
    }
    
    public void Write (){
        try {
            ObjectOutputStream a = new ObjectOutputStream (new FileOutputStream ("Message.dat"));
            System.out.println("Write to binary file");
            a.writeUTF(message);
            a.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public void Read (){
        boolean endfile = false;
        try {
            ObjectInputStream a = new ObjectInputStream(new FileInputStream("Message.dat"));
            System.out.println("Read from binary file.");
            while (!endfile) {
                try {
                    System.out.println(a.readUTF());
                } catch (EOFException ex) {
                    endfile = true;
                }
            }
            a.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
