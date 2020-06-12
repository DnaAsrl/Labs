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
public class HtoN extends Banner{
    public HtoN (char letter) {
        this.letter=letter;
    }
    
    @Override
    public void displayLetter(){
        switch (letter){
            case 'H' : System.out.println(" *     * ");
                       System.out.println(" *     * ");
                       System.out.println(" ******* ");
                       System.out.println(" *     * ");
                       System.out.println(" *     * ");
                       break;

            case 'I' : System.out.println(" ******* ");
                       System.out.println("    *    ");
                       System.out.println("    *    ");
                       System.out.println("    *    ");
                       System.out.println(" ******* ");
                       break;

            case 'J' : System.out.println("  ******* ");
                       System.out.println("      *   ");
                       System.out.println("      *   ");
                       System.out.println(" *    *   ");
                       System.out.println("  ****     ");
                       break;

            case 'K' : System.out.println(" *   * ");
                       System.out.println(" * *   ");
                       System.out.println(" **    ");
                       System.out.println(" * *   ");
                       System.out.println(" *   * ");
                       break;

            case 'L' : System.out.println(" *       ");
                       System.out.println(" *       ");
                       System.out.println(" *       ");
                       System.out.println(" *       ");
                       System.out.println(" ******* ");
                       break;
                       
            case 'M' : System.out.println(" **   ** ");
                       System.out.println(" * * * * ");
                       System.out.println(" *  *  * ");
                       System.out.println(" *     * ");
                       System.out.println(" *     * ");
                       break;
                       
            case 'N' : System.out.println(" **    * ");
                       System.out.println(" * *   * ");
                       System.out.println(" *  *  * ");
                       System.out.println(" *   * * ");
                       System.out.println(" *    ** ");
                       break;
        }
        
        System.out.println("\n");
    }
}
