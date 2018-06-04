/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproj;

/**
 *
 * @author balcopc@pm.me
 */
import java.util.Scanner;
public class TestProj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Enter base Integer: ");
      Scanner in = new Scanner(System.in);
      int base = in.nextInt(); //user input for base integer
      int i=0; //increment counter
      int length = String.valueOf(base).length();//sets length of loop on length of input
      String start = Integer.toString(base);//convert (base) integer to String "start"
              
       while (i<length){
           String strip = (start.substring(0, i+1));//String "strip" converted to int (amath)
           int amath = Integer.parseInt(strip); //convert String "strip" to Integer (amath)
           int result = (amath*8)+(i+1);// Compute Result of actual math
           String pad = "         ".substring(strip.length()); //padding based on length of string "strip"
           System.out.println((pad)+(amath) +" X 8 + "+(i+1)+" = "+(result));//Print line concatinating all variables
                      i++;
           
       }
       
       
       
    }
    
}
