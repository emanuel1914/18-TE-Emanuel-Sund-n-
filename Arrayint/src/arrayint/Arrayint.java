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
public class Arrayint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] tal = new int[10]; /// Array eller ett fält som jab hålla 10 int variabels
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println(" Tal har längden " + tal.length);
        for (int i = 0; i < tal.length; i++) 
        { tal  [i] = keyboard.nextInt();
        
        }
        
        
        // summer talen
        
        // ta reda på största värde 
        
        // ta reda på största värde 
        
        // ta read på medelvärdet 
        
        
        for (int i = 0; i< tal.length; i++) {
          System.out.println ("Tal ["+ i +"] = " + tal[i] ); 
        }
    }
    
}
