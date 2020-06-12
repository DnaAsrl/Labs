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
public class UtoZ extends Banner{
    public UtoZ (char letter) {
        this.letter=letter;
    }
    
    @Override
    public void displayLetter(){
        switch(letter){
            
            case 'U' : System.out.println(" *     * ");
                       System.out.println(" *     * ");
                       System.out.println(" *     * ");
                       System.out.println(" *     * ");
                       System.out.println("  *****  ");
                       break;
                       
            case 'V' : System.out.println(" *       * ");
                       System.out.println("  *     *  ");
                       System.out.println("   *   *   ");
                       System.out.println("    * *    ");
                       System.out.println("     *     ");
                       break;
                       
            case 'W' : System.out.println(" *       *       * ");
                       System.out.println("  *     * *     *  ");
                       System.out.println("   *   *   *   *   ");
                       System.out.println("    * *     * *    ");
                       System.out.println("     *       *     ");
                       break;
                       
            case 'X' : System.out.println(" *     * ");
                       System.out.println("   * *   ");
                       System.out.println("    *    ");
                       System.out.println("   * *   ");
                       System.out.println(" *     * ");
                       break;
                       
            case 'Y' : System.out.println(" *   * ");
                       System.out.println("  * *  ");
                       System.out.println("   *   ");
                       System.out.println("   *   ");
                       System.out.println("   *   ");
                       break;
                       
            case 'Z' : System.out.println(" ***** ");
                       System.out.println("    *  ");
                       System.out.println("   *   ");
                       System.out.println("  *    ");
                       System.out.println(" ***** ");
                       break;
        }
        
        System.out.println("\n");
    }
}
