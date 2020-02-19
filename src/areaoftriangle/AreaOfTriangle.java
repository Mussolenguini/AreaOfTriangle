/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package areaoftriangle;
import java.util.*;

/**
 *
 * @author evrob0095
 */
public class AreaOfTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate Area of Triangle");
        //Get side lengths
        System.out.println("Enter first side length");
        double a = Double.parseDouble(input.nextLine());
        System.out.println("Enter second side length");
        double b= Double.parseDouble(input.nextLine());
        System.out.println("Enter third side length");
        double c = Double.parseDouble(input.nextLine());
        
        //Calc semi-perimeter
        double s = ((a + b + c)/2);
        System.out.println("Semi-perimeter is: " + s);
        
        //Calc area
        if ((s-c) <= 0 || (s-b) <= 0 || (s-a) <= 0) {
            double area = (a + b + Math.sin(c)) / 2;
            System.out.println("The area of the triangle is " + area + " meters squared");  
        }
        else {
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("The area of the triangle is " + area + " meters squared");  
        }
        
      
        
    }
    
}
