/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbertriangle;
import java.util.Scanner;
/**
 *
 * @author Oversoul
 */
public class NumberTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* An application that takes an integer and then outputs the numbers from
        1 to that integer in an ever growing triangle.
        Spaces in between the numbers, no space on the last integer.
        */
       Scanner s = new Scanner(System.in);
       int input  = 0;
       
       input = s.nextInt();
       for (int i = 1; i <= input; i++){
           for (int x = 1; x <= i; x++){
               System.out.print(x);
               if (x < i){
               System.out.printf(" ");
           }
           
           }
            System.out.println("");
       }
    }
    
}
