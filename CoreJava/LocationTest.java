package CoreJava;

import java.util.*;
class Location
{
    private double x;
    private double y;
    public Location(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public void getLocation()
    {
        System.out.println("x is " + x + ", y is " + y + ".");
    }
    public double getDistance()
    {
        return Math.sqrt(Math.pow(x, 2.0) + Math.pow(y, 2.0));
    }
}
public class LocationTest 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please specify x value:");
        double x = input.nextDouble();
        System.out.println("Please specify y value:");
        double y = input.nextDouble();
        Location dist = new Location(x, y);
        double dist_val = dist.getDistance();
        dist.getLocation();
        System.out.println("The distance is " + dist_val + ".");
        input.close();
    }    
}
