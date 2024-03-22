package CoreJava;

import java.util.*;

class Employee_ct
{
    private static int nextId;
    private String name = " ";
    private double salary;
    private int id;
    static 
    {
        var generator = new Random();
        nextId = generator.nextInt(10000);
    }
    {
        id = nextId;
        nextId++;
    }
    public Employee_ct(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }
    public Employee_ct(double salary)
    {
        this("Employee #" + nextId, salary);
    }
    public Employee_ct()
    {

    }
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
    public int getId()
    {
        return id;
    }
}

public class ConstructorTest
{
    public static void main(String[] args)
    {
        var staff = new ArrayList<Employee_ct>();
        staff.add(new Employee_ct("a", 10000));
        staff.add(new Employee_ct(20000));
        staff.add(new Employee_ct());
        for (Employee_ct e : staff)
        {
            System.out.println("name = " + e.getName() + ", id = " + e.getId() + ", salary = " + e.getSalary());
        }
    }
}