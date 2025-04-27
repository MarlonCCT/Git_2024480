/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shape;

import inpututils.InputUtils;



/**
 *
 * @author marlon_k
 */
public class Shape {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        
        InputUtils myInput = new InputUtils();
        
        int h = myInput.askUserForInt("Please enter a rectang h");
        int w = myInput.askUserForInt("Please enter a rectang w");
   
        Retangle r1 = new Retangle(h, w); 
        
        int area = r1.getArea();
        
        System.out.println("the area of this rerctangle is " + area);
        
        double radius = myInput.askUserForInt("Enter the radius of the circle");
        
        Circle c1 = new Circle(radius);
        double circlearea = c1.circleArea();
        
        System.out.println("the area of circle is " + circlearea);
    }
    
}
