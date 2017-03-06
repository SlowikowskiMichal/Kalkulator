import java.util.Scanner;

/**
 * Created by slovi on 06.03.2017.
 */
public class Circle extends Figure implements Print{

    private double radius;

    public Circle(double input) {
        radius = input;
    }

    @Override
    double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    double calculatePerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public void print() {
        System.out.println("Pole koła o promieniu " + radius + " wynosi: " + calculateArea());
        System.out.println("Obwód koła o promieniu " + radius + " wynosi: " + calculatePerimeter());
    }

}
