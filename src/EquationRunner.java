
import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("----------------------------------------------------");
        System.out.println("Hello and welcome to the Linear Equation Calculator!");
        System.out.print("To begin, enter your first coordinate point: ");

        String firstCoordinates = s.nextLine();
        System.out.print("Enter your second coordinate point: ");

        String secondCoordinates = s.nextLine();
        System.out.println("----------------------------------------------------");

        int comma1 = firstCoordinates.indexOf(",");
        int x1 = Integer.parseInt(firstCoordinates.substring(1,comma1));
        int y1 = Integer.parseInt(firstCoordinates.substring((comma1 + 1), (firstCoordinates.length()-1)));


        int comma2 = secondCoordinates.indexOf(",");
        int x2 = Integer.parseInt(secondCoordinates.substring(1,comma2));
        int y2 = Integer.parseInt(secondCoordinates.substring((comma2 + 1), (secondCoordinates.length()-1)));


        LinearEquation z = new LinearEquation(x1,y1,x2,y2);
        System.out.println(z.toString());

        System.out.print("Enter a third x-value: ");
        String thirdCoordinate = s.nextLine();
        double x3 = Double.parseDouble(thirdCoordinate);
        System.out.println("Solved coordinate point is: " + z.thirdCoordinate(x3));
        System.out.println("----------------------------------------------------");
        s.close();








    }
}