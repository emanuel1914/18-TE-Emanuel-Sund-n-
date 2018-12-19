/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayint;

import java.util.Scanner;

/**
 *
 * @author emanuel.sunden
 */
public class Arraycalculator {
  
    //Array för att spara tal i 
      public static void main(String[] args) { 
          
          
          int [] tal = new int [10];
         
 
          //Scanner  för att lässa i från tangenbordet  
          Scanner keyboard = new Scanner(System.in);
          
          
          // Läs i 10 tal
            System.out.println(" Tal har längden " + tal.length);
        for (int i = 0; i < tal.length; i++) 
        { tal  [i] = keyboard.nextInt();
        
        }
          
          
           // Summer talen
           
         int summa = 0; 
         for (int i=0; i < tal.length; i++ ) {
             summa += tal[i];
         }
         
         System.out.println("Summan av talen är "+ summa );
        
        // Ta reda på största värde 
        
        int storstaTalet = Integer.MIN_VALUE;
        
        for (int i=0; i < tal.length; i++ ) {
            if (tal [i] > storstaTalet ) {
                storstaTalet = tal[i];
            }
        }
        System.out.println("Det största talet är " +storstaTalet);
        
        
        // Ta reda på minsta värde 
        int minstaTalet = Integer.MAX_VALUE; 
         for (int i=0; i < tal.length; i++ ) {
            if (tal [i] < minstaTalet ) {
                minstaTalet = tal[i];
            }
        }
        System.out.println("Det minsta talet är " +minstaTalet);
        
        
        
        // Ta read på medelvärdet 
        int Medlvärde = 0;   
          
        
        
        
        System.out.println("Medelvärdet är " +Medlvärde);
      }
}

  