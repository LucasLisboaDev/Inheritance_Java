/*************************************************************************
 * Program: Cube_LA.java
 * Author: Lucas L. Alves
 *
 * Purpose: Program creates classes and works inheritance concepts on Java. 

 * Date Created: Apr 20, 2024
 * Date Completed: Apr 21, 2024
 *************************************************************************/
public class Cube_LA extends Rectangle_LA2 {

    private double height;

    public Cube_LA(double len, double w, double h) {
        super(len, w); // Call to the superclass (Rectangle) constructor
        height = h;
    }

    // Method to get the height of the cube
    public double getHeight() {
        return this.height;
    }
    public void printHeight() {
        System.out.println("Height:\t\t" + getHeight());
    }

    
    public double getSurfaceArea() {
        return 2 * (getLength() * getWidth() + getLength() * height + getWidth() * height);
    }
    public void printSurfaceArea(){
        System.out.println( "Surface Area:\t" + getSurfaceArea());
    }

    
    public double getVolume() {
        return getLength() * getWidth() * height;
    }
    public void printVolume(){
        System.out.println("Volume:\t\t" + getVolume());
    }
    public void displayCubeProperties(){
        System.out.println("Cube Properties:");
        System.err.println("--------------------");
        printLength();
        printWidth();
        printHeight();
        printArea();
        printSurfaceArea();
        printVolume();
        System.out.println("");
    }
}
