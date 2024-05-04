/*************************************************************************
 * Program: Rectangle_LA2.java
 * Author: Lucas L. Alves
 *
 * Purpose: Program creates classes and works inheritance concepts on Java. 

 * Date Created: Apr 20, 2024
 * Date Completed: Apr 21, 2024
 *************************************************************************/
public class Rectangle_LA2 {

    // Private fields for the dimensions of the rectangle
    private double length;
    private double width;

    // Constructor to initialize the dimensions
    public Rectangle_LA2(double len, double w) {
        this.length = len;
        this.width = w;
    }
    public Rectangle_LA2(){

    }

    // Method to set the length
    public void setLength(double len) {
        this.length = len;
    }

    // Method to set the width
    public void setWidth(double w) {
        this.width = w;
    }

    // Method to get the length
    public double getLength() {
     return this.length;
    }

    public void printLength(){
        System.err.println("Length:\t\t" + getLength());
    }

    // Method to get the width
    public double getWidth() {
        return this.width;
    }

    public void printWidth(){
        System.out.println("Width:\t\t" + getWidth());
    }

    // Method to get the area of the rectangle
    public double getArea() {
        Double Area;
        Area = this.length * this.width;
        return Area;
    }

    public void printArea(){
        System.out.println("Base Area:\t" + getArea() );
    }
}

