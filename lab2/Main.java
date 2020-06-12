package lab2;

import java.util.LinkedList;
import java.util.Random;
import java.util.ArrayList;
        

public class Main {

 
    public static void main(String[] args) {
        
        // Q1
        /*
        LinkedList<Integer> object = new LinkedList<Integer>(); 
 
        Random rand = new Random ();
        for (int i=0;i<20;i++){
            int x = rand.nextInt(100);
            if (!object.contains(x)){
                object.add(x);
            }
        }        
        for ( int pass = 1; pass < object.size(); pass++ ) {
            for ( int i = 0; i < object.size() -pass; i++ ) 
                if ( object.get(i)>object.get(i+1) )  {
                    int hold = object.get(i);        
                    object.set(i, object.get(i+1));
                    object.set(i+1, hold);
                }
        }     
        System.out.println("Linked List: " + object);

        ArrayList <Integer> array = new ArrayList <>();
        for (int i=0;i<20;i++){
            int x = rand.nextInt(100);
            if (!array.contains(x)){
                array.add(x);
            }
        }
         for ( int pass = 1; pass < array.size(); pass++ ) {
            for ( int i = 0; i < array.size() -pass; i++ ) 
                if ( array.get(i)>array.get(i+1) )  {
                    int hold = array.get(i);        
                    array.set(i, array.get(i+1));
                    array.set(i+1, hold);
                }
        }     
        System.out.println("Array list : "+array);
        */
        
        // Q2
        /*
        TextFileLog a = new TextFileLog (5);
        a.insert("James");
        a.insert("Ahmad");
        a.insert("Ahmad");
        a.insert("Siti");
        a.insert("Ramesh");
        a.insert("John");
        System.out.println(a.full());
        System.out.println(a.contains("Siti"));
        a.delete();
        System.out.println(a.size());
        */  
        
       //Q3
    
       UNO draw = new UNO();
       System.out.println("ARRAY IMPLEMENTION");
       ArrayList<String> uno = new ArrayList<>();
       for (int i =0;i<10;i++){
           uno.add(i+" Red");
           uno.add(i+" Yellow");
           uno.add(i+" Green");
           uno.add(i+" Blue");
       }
       uno.add("Blue draw two");
       uno.add("Red draw two");
       uno.add("Green draw two");
       uno.add("Yellow draw two");
       uno.add("Blue skip");
       uno.add("Red skip");
       uno.add("Green skip");
       uno.add("Yellow skip");
       uno.add("Yellow draw four");
       uno.add("Red draw four");
       uno.add("Green draw four");
       uno.add("Blue draw four");
       uno.add("Yellow reverse");
       uno.add("Blue reverse");
       uno.add("Red reverse");
       uno.add("Green reverse");
       
       int check =0;
       System.out.println("Player 1:");
       while (check!=7){
           System.out.print(uno.get(draw.drawcard())+"; ");
           check++;
       }
       System.out.println("");
       check=0;
       System.out.println("Player 2:");
       while (check!=7){
           while (check!=7){
           System.out.print(uno.get(draw.drawcard())+"; ");
           check++;
       }
       }
        System.out.println("\n");
       
        System.out.println("LINKED LIST IMPLEMENTATION");
        LinkedList <String> UNO = new LinkedList <String>();
        for (int i =0;i<10;i++){
           UNO.add(i+" Red");
           UNO.add(i+" Yellow");
           UNO.add(i+" Green");
           UNO.add(i+" Blue");
       }
       UNO.add("Blue draw two");
       UNO.add("Red draw two");
       UNO.add("Green draw two");
       UNO.add("Yellow draw two");
       UNO.add("Blue skip");
       UNO.add("Red skip");
       UNO.add("Green skip");
       UNO.add("Yellow skip");
       UNO.add("Yellow draw four");
       UNO.add("Red draw four");
       UNO.add("Green draw four");
       UNO.add("Blue draw four");
       UNO.add("Yellow reverse");
       UNO.add("Blue reverse");
       UNO.add("Red reverse");
       UNO.add("Green reverse");

       check =0;
       System.out.println("Player 1:");
       while (check!=7){
           while (check!=7){
           System.out.print(UNO.get(draw.drawcard())+"; ");
           check++;
       }
       }
       System.out.println("");
       check=0;
       System.out.println("Player 2:");
       while (check!=7){
           while (check!=7){
           System.out.print(UNO.get(draw.drawcard())+"; ");
           check++;
       }
       }
        System.out.println("");
    }
    
    public static class UNO {

        public int drawcard() {
            Random rand = new Random ();
            int x = rand.nextInt(56);
            return x;
        }

        @Override
        public String toString() {
            return "UNO{" + '}';
        }
        
    }
    
  }