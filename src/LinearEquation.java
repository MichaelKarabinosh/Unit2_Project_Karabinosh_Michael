public class LinearEquation {
    private int x1; // Instance variables for coordinates of two points
    private int x2;
    private int y1;
    private int y2;

    public LinearEquation(int x1, int y1, int x2, int y2) // Constructor creates the format for a LinearEquation object, using the 4 instance variables
    {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double calculateSlope() // Calculates the slope of the line using rise/run
    {
        return (double)(y2-y1)/(double)(x2-x1);
    }

    public double calculateYInt() // Calculates the y-intercept of the line
    {
        return y1 - calculateSlope()*x1;
    }

    public String equation() // Generates the equation of the line in slope-intercept form according to challenge functionality
    {
        if (calculateYInt()>0) // If the y-int is > 0, like 1.5, the equation will be printed with y = mx + b
        {
            return "y = " + fractionSlope() + "x + " + String.format("%.2f",calculateYInt());
        }
        else if (calculateYInt()<0) { // If the y-int is negative, we return the equation as y = mx - |b|, in order to avoid the y = mx + -b, following challenge functionality
            return "y = " + fractionSlope() + "x" + " - " + String.format("%.2f",Math.abs(calculateYInt()));
        }
        else { // Lastly y-intercept = 0, we print y = mx, instead of y = mx + 0, according to challenge functionality
            return "y = " + fractionSlope() + "x";
        }
    }
    public double calculateDistance() // Calculates distance between the two points using distance formula
    {
        return Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
    }

    public String fractionSlope() // Calculates the slope to be used in printing the equation. Outputs a numerically identical slope as above method, just with proper fraction and negative sign formatting, following challenge functionality
    {
        int num = y2-y1;
        int denom = x2-x1;
        if (num % denom == 0) // Basically checks if the slope is an int
        {
            if (num/denom == 1) // Returns no slope, so x instead of 1x if slope = 1
            {
                return "";
            }
            else { // Returns slope as mx otherwise
                return String.valueOf(num/denom);
            }
        }
        if (denom < 0) // Switches the signs of the numerator and denominator so if the denom is < 0, the num inherits the negative sign
        {
            return -num + "/" + -denom;
        }
        else { // Prints the slope as a fraction after all other cases have been checked
            return num + "/" + denom;
        }
    }

    public String thirdCoordinate(double x3) // Calculates coordinate for third x value
    {
        double y3 = calculateSlope() * x3 + calculateYInt();
        return "(" + String.format("%.2f",x3)  + ", " + String.format("%.2f",y3) + ")";
    }

    public String toString() // Returns the original coordinates, y intercept, slope of the line, distance between the two points, and the equation of the line, using neat formatting,
    {
        String a = "Your first coordinates were (" + x1 + "," + y1 + ")" + "\n" + "Your second coordinates were (" + x2 + "," + y2 + ")";
        String b = "\nThe slope of the line is: " + String.format("%.2f", calculateSlope()) + "\n" + "The y-intercept is: " + String.format("%.2f", calculateYInt());
        String c = "\nThe distance between the two points is: " + String.format("%.2f", calculateDistance());
        String d = "\nThe equation of the line is: " + equation();
        String e = "\n----------------------------------------------------";
        return a + b + c + d + e;
    }
}
