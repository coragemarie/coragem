/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marieutouto;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class MarieUtoUto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scn = new Scanner (System.in);
        
        System.out.println("Entr any word:");
        String word = scn.nextLine();
        
        System.out.println("Original word: " + word);
        
        String newWord = new StringBuilder(word).reverse().toString();
        
        System.out.println("Reversed word; " + newWord);
        
                
          
    }
  
    }

