package interfaces;

import Shapes.*;

import java.util.Locale;
import java.util.Scanner;

public class DrawingBoard {

    public void addFigure() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the scale of the figure?");
        System.out.println("Enter the scale size in the console!");
        int n = scanner.nextInt();
        System.out.println("What figure do you want to draw?");
        System.out.println("Circle, Diamond, Square, Trapeze, Triangle");
        System.out.println("Enter the name in the console!");
        String figure = scanner.next().toLowerCase();
        scanner.close();
        if (n >= 3) {
            switch (figure) {
                case "circle":
                    new Circle().printFigure(n);
                    break;
                case "diamond":
                    new Diamond().printFigure(n);
                    break;
                case "square":
                    new Square().printFigure(n);
                    break;
                case "trapeze":
                    new Trapeze().printFigure(n);
                    break;
                case "triangle":
                    new Triangle().printFigure(n);
                default:
                    System.out.println("Sorry, I can't draw this figure!");
            }
        }
        else {
            System.out.println("Sorry, but this resolution is not supported by your monitor!");
        }
    }

}

