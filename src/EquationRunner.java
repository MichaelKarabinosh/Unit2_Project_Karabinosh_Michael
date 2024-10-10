import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in); // Create a scanner object for user input
        System.out.println("----------------------------------------------------"); // Introduction message
        System.out.println("Hello and welcome to the Linear Equation Calculator!");
        System.out.print("To begin, enter your first coordinate point: ");


        String firstCoordinates = s.nextLine(); // Get first coordinate from the user
        System.out.print("Enter your second coordinate point: ");


        String secondCoordinates = s.nextLine(); // Get second coordinate from the user
        System.out.println("----------------------------------------------------");


        int comma1 = firstCoordinates.indexOf(","); // Locating the comma to spilt x and y
        int x1 = Integer.parseInt(firstCoordinates.substring(1,comma1)); // The ( is in index 0 always, so we start from idx 1 until the comma
        int y1 = Integer.parseInt(firstCoordinates.substring((comma1 + 1), (firstCoordinates.length()-1))); // Here we parse from right after the comma to before the parentheses, which is always at idx length, so we do length - 1


        int comma2 = secondCoordinates.indexOf(","); // Same approach as above
        int x2 = Integer.parseInt(secondCoordinates.substring(1,comma2));
        int y2 = Integer.parseInt(secondCoordinates.substring((comma2 + 1), (secondCoordinates.length()-1)));


        LinearEquation z = new LinearEquation(x1,y1,x2,y2); // Create an instance of LinearEquation class using the two points
        System.out.println(z.toString());


        System.out.print("Enter a third x-value: "); // Ask the user for a third x-value to calculate the y-value
        String thirdCoordinate = s.nextLine();
        double x3 = Double.parseDouble(thirdCoordinate); // Easier to parse because we're not dealing with multiple points or parentheses
        System.out.println("Solved coordinate point is: " + z.thirdCoordinate(x3));
        System.out.println("----------------------------------------------------");
        s.close(); // Closing scanner to prevent memory leak
    }
}
