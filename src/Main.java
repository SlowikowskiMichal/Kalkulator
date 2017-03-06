import java.util.Scanner;

/**
 * Created by slovi on 06.03.2017.
 */
public class Main {
    public static void main(String[] args)
    {
        char choice;
        boolean run = true;
        double[] input = new double[3];
        Scanner scanner = new Scanner(System.in);

        while(run){
            System.out.println("Wybierz figurę:");
            System.out.println("1.Trójkąt\n2.Kwadrat\n3.Koło\n4.Wyjście");

            choice = scanner.next().trim().charAt(0);
            switch(choice)
            {
                case '1': {
                    System.out.println("Podaj długości boków:");
                    input[0] = scanner.nextDouble();
                    input[1] = scanner.nextDouble();
                    input[2] = scanner.nextDouble();
                    Triangle triangle = new Triangle(input[0],input[1],input[2]);
                    triangle.print();
                    break;
                }
                case '2':
                {
                    System.out.println("Podaj długość boku kwadratu:");
                    input[0] = scanner.nextDouble();
                    Square square = new Square(input[0]);
                    square.print();
                    break;
                }
                case '3':
                {
                    System.out.println("Podaj promień koła:");
                    input[0] = scanner.nextDouble();
                    Circle circle = new Circle(input[0]);
                    circle.print();
                    break;
                }
                case '4':
                {
                    System.out.print("Jesteś pewien?(Y/N):");
                    choice = scanner.next().trim().charAt(0);

                    if(choice == 'y' || choice == 'Y')
                        run = false;
                    break;
                }
                default:
                {
                    System.out.println("Niewłaściwa operacja");
                    break;
                }
            }
        }

    }
}
