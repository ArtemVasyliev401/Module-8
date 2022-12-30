package Shapes;

import interfaces.Shape;
import java.util.Scanner;

public class Triangle implements Shape {


    @Override
    public void printFigure(int n) {
       String res = "";
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                result.append(" ");
            }
            for (int c = 1; c <= (i * 2) - 1; c++) {
                result.append("*");
            }
           res = String.valueOf(result.append(System.lineSeparator()));

        }
        System.out.println(res);
        System.out.println("Congratulations, you have drawn a 'Triangle'");
    }
}


