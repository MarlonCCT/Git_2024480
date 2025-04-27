/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author marlon_k
 */
public class Retangle {
    //Proparties
    private int height;
    private int lenght;
    
    // Constructor(s)
    /**
     * Constructor for a rectangle
     * @param height the height of this rectangle as an int
     * @param lenght the lenght of this rectangle as an int
     */
    public Retangle(int height, int lenght){
        
        this.height = height;
        this.lenght = lenght;
        
    }

    /**
     * Calculate area of rectangle
     * @return the area as an int 
     */
    //METHODS
    public int getArea() {
        return(this.height * this.lenght);
    }
}
