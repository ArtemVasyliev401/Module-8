package Shapes;
import interfaces.Shape;
public class Circle implements Shape {
    @Override
    public void printFigure(int n) {
        double dist;
        for (int i = 0; i <= 2 * n; i++) {
            for (int j = 0; j <= 2 * n; j++) {
                dist = Math.sqrt((i - n) * (i - n) +
                        (j - n) * (j - n));
                if (dist > n - 0.5 && dist < n + 0.5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print("\n");
        }
        System.out.println("Congratulations, you have drawn a 'Circle'");
    }



}
