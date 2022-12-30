package Shapes;

import interfaces.Shape;

import java.util.Scanner;

public class Diamond implements Shape {
    @Override
    public void printFigure(int n) {
        int e = (n)/2;
        int row = 1;

        for (int i = e; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= row; j++) {
                System.out.print("* ");
            }
            System.out.println();
            row++;
        }

        for (int i = 0; i <= e; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = row; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
            row--;
        }
        System.out.println("Congratulations, you have drawn a 'Diamond'");
    }


}
