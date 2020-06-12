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
public class OtoT extends Banner{
    public OtoT (char letter) {
        this.letter=letter;
    }
    
    @Override
    public void displayLetter(){
        switch(letter){

            case 'O' : System.out.println("  ****  ");
                       System.out.println(" *    * ");
                       System.out.println(" *    * ");
                       System.out.println(" *    * ");
                       System.out.println("  ****  ");
                       break;

            case 'P' : System.out.println(" ****  ");
                       System.out.println(" *   * ");
                       System.out.println(" ****  ");
                       System.out.println(" *     ");
                       System.out.println(" *     ");
                       break;

            case 'Q' : System.out.println("  ****  ");
                       System.out.println(" *    * ");
                       System.out.println(" *  * * ");
                       System.out.println("  ****  ");
                       System.out.println("      * ");
                       break;

            case 'R' : System.out.println(" ****   ");
                       System.out.println(" *   *  ");
                       System.out.println(" ****   ");
                       System.out.println(" *   *  ");
                       System.out.println(" *    * ");
                       break;

            case 'S' : System.out.println("   **** ");
                       System.out.println("  **    ");
                       System.out.println("   **   ");
                       System.out.println("    **  ");
                       System.out.println(" ****   ");
                       break;

            case 'T' : System.out.println(" ******* ");
                       System.out.println("    *    ");
                       System.out.println("    *    ");
                       System.out.println("    *    ");
                       System.out.println("    *    ");
                       break;
        }
        
        System.out.println("\n");
    }
}
