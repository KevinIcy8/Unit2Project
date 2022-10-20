import java.text.DecimalFormat;

public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    //my decimal format so I can round to the nearest hundredth
    DecimalFormat df = new DecimalFormat("0.00");

    //next two codes calculate and print the slope
    public double calculateSlope() {
        int deltaX = x2 - x1;
        int deltaY = y2 - y1;
        double slope = (double) deltaY / deltaX;
        return slope;
    }

    public void getSlope() {
        System.out.println("Slope of line: " + df.format(calculateSlope()));
    }

    //this calculates and prints the distance between points
    public void getDistance() {
        System.out.println("Distance between points: " + df.format(Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2))));
    }

    //next two codes calculate and print y intercept
    public double calYIntercept() {
        double yIntercept = y1 - (calculateSlope() * x1);
        return yIntercept;
    }

    public void getYIntercept() {
        System.out.println("Y-intercept: " + df.format(calYIntercept()));
    }

    //print all the information in slope intercept form
    public void slopeIntForm() {
        int deltaX = x2 - x1;
        int deltaY = y2 - y1;
        if (deltaX == 1) {
            System.out.println("Slope intercept form: y = " + deltaY + "x + " + df.format(calYIntercept()));
        } else if (deltaY % deltaX == 0) {
            int wholeNumSlope = deltaY / deltaX;
            System.out.println("Slope intercept form: y = " + wholeNumSlope + "x + " + df.format(calYIntercept()));
        } else {
            System.out.println("Slope intercept form: y = " + deltaY + "/" + deltaX + "x + " + df.format(calYIntercept()));
        }
    }

    //takes in newX and then calculates and print the y corresponding to that x
    public void getCalY(double newX)
    {
        double calY = Double.parseDouble(df.format((calculateSlope()*newX)+calYIntercept()));
        System.out.println("Solved coordinate point is: (" + newX + "," + calY + ")");
    }

}


