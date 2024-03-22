package CoreJava;

import java.util.*;
class Employee_proto 
{
    private String name;
    private double salary;
    private int age;
    public Employee_proto(String name, double salary, int age)
    {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
    public int getAge()
    {
        return age;
    }
}
public class EmployeeTest
{
    public static void main(String[] args)
    {
        System.out.println("How many workers do you want to update?");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.nextLine();
        Employee_proto[] staff = new Employee_proto[num];
        int i = 0;
        for (i = 0;i < staff.length;i++)
        {
            System.out.printf(i + 1 + ": ");
            String staff_name = input.next();
            double staff_salary = input.nextDouble();
            int staff_age = input.nextInt();
            input.close();   
            staff[i] = new Employee_proto(staff_name, staff_salary, staff_age);
        }
        for (Employee_proto e:staff)
        {
            System.out.println("Worker's name is " + e.getName() + ", salary is " + e.getSalary() + ", and age is " + e.getAge() + ".");
        }
    }
}
