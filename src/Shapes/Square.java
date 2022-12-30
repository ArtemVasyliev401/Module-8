package Shapes;

import interfaces.Shape;

import java.util.Scanner;

public class Square implements Shape {
    @Override
    public void printFigure(int n) {

        String res = "";
        StringBuilder result = new StringBuilder();

        for(int i=0; i<(n-1); i++){
            for(int j=0; j<n; j++){
                result.append("* ");
            }
            result.append("  ");
            result.append("\n");
        }
        res = String.valueOf(result);
        System.out.println(res);
        System.out.println("Congratulations, you have drawn a 'Square'");
    }

}
