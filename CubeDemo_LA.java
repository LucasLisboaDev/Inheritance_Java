/*************************************************************************
 * Program: CubeDemo_LA.java
 * Author: Lucas L. Alves
 *
 * Purpose: Program creates classes and works inheritance concepts on Java. 

 * Date Created: Apr 20, 2024
 * Date Completed: Apr 21, 2024
 *************************************************************************/

public class CubeDemo_LA {
    public static void main(String[] args) {
        
        Cube_LA aCube = new Cube_LA(10, 15, 12);
        
        aCube.printLength();
        aCube.printWidth();
        aCube.printHeight();
        aCube.printArea();
        aCube.printSurfaceArea();
        aCube.printVolume();

    }
}
