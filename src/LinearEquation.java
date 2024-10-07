public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private double x3;
    private double y3;

    public LinearEquation(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public double calculateSlope()
    {
        double slope = (double)(y2-y1)/(double)(x2-x1);
        return slope;
    }
    public double calculateYInt()
    {
        double YInt = y1 - (calculateSlope()*x1);
        return YInt;
    }
    public String equation()
    {
        if (calculateYInt()>0)
        {
            String equation = "y = " + fractionSlope() + "x + " + calculateYInt();
            return equation;
        }
        else if (calculateYInt()<0) {
            String equation = "y = " + fractionSlope() + "x" + " - " + Math.abs(calculateYInt());
            return equation;
        }
        else {
            String equation = "y = " + fractionSlope() + "x";
            return equation;
        }
    }
    public double calculateDistance()
    {
        double distance = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        return distance;
    }
    public double calculateThirdPoint(double x3)
    {
        double y3 = calculateSlope() * x3 + calculateYInt();
        return y3;
    }
    public String printCoordinates(double x, double y)
    {
        String coords = "(" + x + ", " + y + ")";
        return coords;
    }

    public String fractionSlope()
    {
        int num = y2-y1;
        int denom = x2-x1;
        if (num % denom == 0)
        {
            if (num/denom == 1)
            {
                return "";
            }
            else {
                return String.valueOf(num/denom);
            }

        }
        if ((double)(num)/denom > 0)
        {
            return -1 * num + "/" + -1 * denom;
        }
        else if (denom < 0){
            return -1 * num + "/" + -1 * denom;
        }
        else {
            return num + "/" + denom;
        }
    }
public String test() {
        return fractionSlope();
    }
    public String thirdCoordinate(double x3)
    {
        double y3 = calculateSlope() * x3 + calculateYInt();
    return "(" + String.format("%.2f",x3)  + ", " + String.format("%.2f",y3) + ")";
    }
    public String toString()

    {
        String a = "Your first coordinates were (" + x1 + "," + y1 + ")" + "\n" + "Your second coordinates were (" + x2 + "," + y2 + ")";
        String b = "\nThe slope of the line is: " + String.format("%.2f", calculateSlope()) + "\n" + "The y-intercept is: " + String.format("%.2f", calculateYInt());
        String c = "\nThe distance between the two points is: " + String.format("%.2f", calculateDistance());
        String d = "\nThe equation of the line is: " + equation();
        String e = "\n----------------------------------------------------";
        String allInfo = a + b + c + d + e;
        return allInfo;


    }
}


