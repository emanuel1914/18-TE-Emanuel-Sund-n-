/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.util.Scanner;

/**
 *
 * @author emanuel.sunden
 */
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String first_name;

        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter your name");
        first_name = user_input.next();
        
        String family_name;
        System.out.print("Enter your family name: ");
        family_name = user_input.next();

        String full_name;
        full_name = first_name + " " + family_name;
        System.out.println("You are " + full_name);
    }

}
