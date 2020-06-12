/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Dina
 */
public class AtoG extends Banner {
    
    public AtoG(char letter) {
        this.letter=letter;
    }
    
    @Override
    public void displayLetter(){
        switch(letter){

            case 'A' : System.out.println("     *    ");
                       System.out.println("    * *   ");
                       System.out.println("   *   *  ");
                       System.out.println("  * *** * ");
                       System.out.println(" *       *");
                       break;
                       
            case 'B' : System.out.println(" ****  ");
                       System.out.println(" *   * ");
                       System.out.println(" ****  ");
                       System.out.println(" *   * ");
                       System.out.println(" ****  ");
                       break;
                     
            case 'C' : System.out.println("   **** ");
                       System.out.println("  *     ");
                       System.out.println(" *      ");
                       System.out.println("  *     ");
                       System.out.println("   **** ");
                       break;
        
            case 'D' : System.out.println(" ******   ");
                       System.out.println(" *     *  ");
                       System.out.println(" *      * ");
                       System.out.println(" *     *  ");
                       System.out.println(" ******   ");
                       break;
        
            case 'E' : System.out.println(" ******* ");
                       System.out.println(" *       ");
                       System.out.println(" ******* ");
                       System.out.println(" *       ");
                       System.out.println(" ******* ");
                       break;
                              
            case 'F' : System.out.println(" ******* ");
                       System.out.println(" *       ");
                       System.out.println(" ******* ");
                       System.out.println(" *       ");
                       System.out.println(" *       ");
                       break;
         
            case 'G' : System.out.println("   ****   ");
                       System.out.println("  *       ");
                       System.out.println(" *   **** ");
                       System.out.println("  *    *  ");
                       System.out.println("   *****  ");
                       break;
        }   
        
        System.out.println("\n");
    }
}