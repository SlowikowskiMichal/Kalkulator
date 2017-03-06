import java.util.Scanner;

/**
 * Created by slovi on 06.03.2017.
 */
public class Square extends Figure implements Print{

    private double side;

    public Square(double input) {
        side = input;
    }

    @Override
    double calculateArea() {
        return side*side;
    }

    @Override
    double calculatePerimeter() {
        return side*4;
    }

    @Override
    public void print() {

        System.out.println("Pole kwadratu o boku " + side + " wynosi: " + calculateArea());
        System.out.println("Obwód kwadratu o boku " + side + " wynosi: " + calculatePerimeter());

    }
}
