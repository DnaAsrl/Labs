package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        //Question 1
        /*
        Time a = new Time(12,0);
        a.checkTime();
        */
        //Question 2
        /*
        double [] p ={-20,-0.5,2.0,4.0};
        Polynomial b = new Polynomial (p.length,p);
        b.displayPoly();
        System.out.println("When x = 2.0 "+b.computeX(2.0));
        */
        //Question 3
        /*
        String [][] host={{"10.1.1.1","255.255.255.224","UP"},{"10.1.1.2","255.255.255.224","DOWN"},{"10.1.1.70","255.255.255.224","UP"},{"10.1.1.15","255.255.255.224","UP"}};
        SimpleNetwork c = new SimpleNetwork(host);
        c.displayHost();
        System.out.println(c.PingHost(1, 2));
        */
        //Question 4
        /*
        String word = "FSKTM";
        word=word.toUpperCase();
        char letter []=word.toCharArray();
        for (int i =0;i<letter.length;i++){
            if (letter[i]>=65&&letter[i]<=71){
                AtoG a = new AtoG (letter[i]);
                a.displayLetter();
            }
            if (letter[i]>=72&&letter[i]<=78){
                HtoN a = new HtoN (letter[i]);
                a.displayLetter();
            }
            if (letter[i]>=79&&letter[i]<=84){
                OtoT a = new OtoT (letter[i]);
                a.displayLetter();
            }
            if (letter[i]>=85&&letter[i]<=90){
                UtoZ a = new UtoZ (letter[i]);
                a.displayLetter();
            }
        }
        */
        //Question 5
        String message = "Welcome to FSKTM!\nPlease register your matric number.\nPlease register your UMMail account.";
        TextFile a = new TextFile (message);
        a.Write();
        a.Read();
        BinaryFile b = new BinaryFile (message);
        b.Write();
        b.Read();
    }
    
}
