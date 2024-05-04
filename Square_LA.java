/*************************************************************************
 * Program: Square_LA.java
 * Author: Lucas L. Alves
 *
 * Purpose: Program creates classes and works inheritance concepts on Java. 

 * Date Created: Apr 20, 2024
 * Date Completed: Apr 21, 2024
 *************************************************************************/
public class Square_LA extends Rectangle_LA2 {
    private double side;
    

    public Square_LA(double sd) {
        side = sd;
    }
    public double getLength(){
        return this.side;
    }
    public void printlengthSquare(){
        System.out.println("Length:\t\t" + getLength());
    }
    public double getWidth(){
        return this.side;
    }
    public void printWidthSquare(){
        System.out.println("Width:\t\t" + getWidth());
    }
    public double getAreaSquare(){
        return this.side * this.side;
    }
    public void printAreaSquare(){
        System.out.println("Area:\t\t" + getAreaSquare());
    }
    public void displaySquareProperties(){
        System.out.println("Square Properties:");
        System.err.println("--------------------");
        printLength();
        printWidth();
        printAreaSquare();
        System.out.println("");
    }
}
