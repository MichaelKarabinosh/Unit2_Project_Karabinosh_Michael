public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public LinearEquation(int x1, int x2, int y1, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public double calculateSlope()
    {
        double slope = (double) (y2-y1/x2-x1);
        return slope;
    }
    public double calculateYInt()
    {
        double YInt = y1 - (calculateSlope()*x1);
        return YInt;
    }
    public void equation()
    {
        if (calculateYInt()>0){
            System.out.println("y = " + calculateSlope() + " x" + calculateYInt());
        }
        else if (calculateYInt()<0) {
            System.out.println("y = " + calculateSlope() + " x" + " - " + Math.abs(calculateYInt()));
        }
        else {
            System.out.println("y = " + calculateSlope() + " x");
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
    public void printCoordinates(double x, double y)
    {
        System.out.print("(" + x + ", " + y + ")");
    }
    public String toString()

    {
        System.out.println("Your first coordinates were, ");
        printCoordinates(x1,y1);
        System.out.println("Your second coordinates were, ");
        printCoordinates(x2,y2);


    }
}


