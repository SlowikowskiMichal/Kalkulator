import java.util.Scanner;

import static java.lang.Math.sqrt;

/**
 * Created by slovi on 06.03.2017.
 */
public class Triangle extends Figure implements Print{

    private double a,b,c;   //boki trójkąta

    public Triangle(double inputa, double inputb, double inputc) {
        a = inputa;
        b = inputb;
        c = inputc;
    }

    @Override
    double calculateArea() {

        double p = (a+b+c)/2;

        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    double calculatePerimeter() {

        return a+b+c;
    }

    @Override
    public void print() {
        System.out.format("Pole trójkąta o bokach %f %f %f wynosi: %f\n", a, b, c, calculateArea());
        System.out.format("Obwód trójkąta o bokach %f %f %f wynosi: %f\n", a, b, c, calculatePerimeter());
//        System.out.println("Pole trójkąta o bokach " + a + " " + b + " " + c + " " + " wynosi: " + calculateArea());
//        System.out.println("Obwód trójkąta " + a + b + c + " wynosi: " + calculatePerimeter());
    }
}
