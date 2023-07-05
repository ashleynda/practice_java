package Practice;

import java.util.Scanner;

public class DiamondPrinting {
    public static void main(String[] args) {
        int row = 7;

        for (int rows=0; rows<row; rows++) {
            for (int column = 0; column<row-rows-1; column++) {
                System.out.print(" ");
            }
            for (int column = 0; column<=rows; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int rows= 0; rows<row-1; rows++) {
            for (int column = 0; column<=rows; column++) {
                System.out.print(" ");
            }
            for (int column=0; column<row-rows-1; column ++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}




// for (int rows = 1; rows < 9; rows += 2) {
//            for (int column = 0; column < 9 - rows / 2; column++)
//                System.out.print(" ");
//            for (int colum = 0; colum < rows; colum++)
//                System.out.print("*");
//
//            System.out.println("\n");
//        }



