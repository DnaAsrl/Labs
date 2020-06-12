package lab.pkg3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Question 1
        /*
        System.out.println(mesh(7));
        */
        
        //Question 2
        /*
        try { 
            Scanner out = new Scanner(new FileInputStream("input.txt"));
            
            while (out.hasNextLine()) {
                String s1 = out.nextLine();
                reverse(s1, s1.length() - 1);
                sum = "";
            }            
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } 
        */
        // Question 3
        /*
        int no[] = {1,2,3};
        permutations(no, 0);
        */
        
        // Question 4
        /*
         Scanner input = new Scanner(System.in);
        System.out.print("Today date (dd/mm/yyyy) : ");
        String s1 = input.next();
        System.out.print("Today is on ");
        s2 = input.next();
        System.out.print("Search Date (dd/mm/yyyy): ");
        String s3 = input.next();
        
        String[] arr = s1.split("/");
        sday = Integer.parseInt(arr[0]);
        smonth = Integer.parseInt(arr[1]);
        syear = Integer.parseInt(arr[2]);
        
        String[] arr2 = s3.split("/");
        int day = Integer.parseInt(arr2[0]);
        int month = Integer.parseInt(arr2[1]) ;
        int year = Integer.parseInt(arr2[2]) ;
        int num = 0;
        
        if(leap(syear-1))
            num += 2;
        else
            num++;
        
        System.out.println(num);
        Search(day , month , year , Check(s2));
        //Search1(day , month-1 , num);
        */

        // Question 5
         Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        int i=0;
        
        while(true){
            
            try{
                System.out.print("Enter an integer : ");
                arr[i] = input.nextInt();
                i++;
            }catch(ArrayIndexOutOfBoundsException e){
                break;
            }catch(InputMismatchException e){
                System.out.println("Invalid input type");
                //System.out.print("Enter an integer : ");
                input.nextLine();                
            }
        }
        
        System.out.println("\nThe element of the array : ");
        for(int j=0 ; j<5 ; j++)
            System.out.print(arr[j] + " ");
    }
    
    public static int mesh (int n){
        if (n==1){
            return 0;
        }
        else {
            return n-1+mesh(n-1);
        }
    }
    
    private static String sum = "";
    
    public static void reverse (String word, int num){
        if (num == 0) {
            
            sum += word.charAt(num);
            try {
                PrintWriter input = new PrintWriter(new FileOutputStream("reverse.txt" , true));
                input.print(sum+"\n");                        
                input.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }else{
            sum += word.charAt(num);
            reverse(word,--num);
        }
    }
    
    public static void swap(int[] no, int i, int j){
        int temp = no[i];
        no[i] = no[j];
        no[j] = temp;
    }
    
    public static void permutations(int[] no, int currentIndex){
        if (currentIndex == no.length - 1) {
            for(int i =0;i<no.length;i++){
                System.out.print(no[i]);
            }
            System.out.println("");
        }
        for (int i = currentIndex; i < no.length; i++){
            swap(no, currentIndex, i);
            permutations(no, currentIndex + 1);
            swap(no, currentIndex, i);
        }
    }
     private static int sday = 0 , smonth=0, syear=0;
    private static String s2;
    
    public static void Day(int x){
        
        switch(x){
            case 0 : System.out.println("Sunday");
                     break;
            case 1 : System.out.println("Monday");
                     break;
            case 2 : System.out.println("Tuesday");
                     break;
            case 3 : System.out.println("Wednesday");
                     break;
            case 4 : System.out.println("Thursday");
                     break;
            case 5 : System.out.println("Friday");
                     break;
            case 6 : System.out.println("Saturday");
                     break;
            default : System.out.println("done");
                      break;
        }
    }
    
    public static int Check(String s){
        
        if(s.equalsIgnoreCase("Sunday"))
            return 0;
        else if(s.equalsIgnoreCase("Monday"))
            return 1;
        else if(s.equalsIgnoreCase("Tuesday"))
            return 2;
        else if(s.equalsIgnoreCase("Wednesday"))
            return 3;
        else if(s.equalsIgnoreCase("Thursday"))
            return 4;
        else if(s.equalsIgnoreCase("Friday"))
            return 5;
        else 
            return 6;      
    }
    
    public static int Month(int num , int year){
        
        switch(num){
            case 1 : 
            case 3 :
            case 5 :
            case 7 :    
            case 8 :
            case 10 :
            case 12 : return 3;
                
            case 2 : if(leap(year))
                        return 1;
                     else 
                        return 0;
                        
            case 4 : 
            case 6 :
            case 9 :
            case 11 : return 2;
            
            default : return 0;
        }
    }
    
    public static void Search1(int day , int month , int check){
        
        if(day < sday){
            System.out.println(check);
            Day(check%7);
        }else{
            if(month == smonth)
                Search1(--day , month , ++check);
            else{
                check += Month(month , syear);
                Search1(day , --month , check );    
            }
        }
    }
    
    
    
    public static void Search(int day , int month , int year , int check){
        
       /* if(check<0)
            check = 6;
        else if(check>6)
            check = 0;*/
        
        if((year == syear-1) || (year == syear)){     
                     
            if((month == smonth)){
                if(day == sday){

                    System.out.println(check);
                    if(check > 6)
                        check %= 7;
                    
                    System.out.println(check);
                    Day(check);

                }else if(day == 0){
                    Search(++day , month , year , ++check); 
                    
                }else if(day > sday){
                    Search(--day , month , year , ++check);
                    
                }else{
                    Search(++day , month , year , --check);    
                }
                               
            }else if(month == 0){
                for(int i=month ; i<smonth ; i++){
                    check += Month(month++ , year);
                    month++;
                }
                
                Search(0 , ++month , year , check);
                                              
            }else{               
                for(int i=month ; i<=12 ; i++){
                    check += Month(month , year);
                    
                }
                Search(day , 0 , year , check);
            }
            
        }else if(year > syear){
           if(leap(year))
               Search(day , month , --year , check+2);
           else
               Search(day , month , --year , check+1);   
           
        }else{
           if(leap(year))
               Search(day , month , ++year , check+2);
           else
               Search(day , month , ++year , check+1);           
        }
    }
    
    public static boolean leap(int year){
        if((year%100 == 0) ){
            return year%400 == 0;
        }else{
            return year%4 == 0;
        }           
    }
}
