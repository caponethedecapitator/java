package CoreJava;

import java.util.*;

class Employee_st implements Comparable
{
    private String name = " ";
    private int age;
    private double salary;

    public Employee_st()
    {

    }

    public Employee_st(String name, int age, double salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public double getSalary()
    {
        return salary;
    }

    public void raiseSalary(double byPercent)
    {
        if (byPercent <= 0 || byPercent >= 100)
        {
            System.out.println("Wrong number!");
        }
        else
        {
            double raise = salary * byPercent / 100;
            salary = salary + raise;
        }
    }

    public int compareTo(Object otherObject)
    {
        Employee_st other = (Employee_st) otherObject; 
        return Double.compare(salary, other.salary);
    }
}

public class EmployeeSortTest
{
    public static void main(String[] args)
    {
        Employee_st[] staff = new Employee_st[3];
        
        staff[0] = new Employee_st("Harry Hacker", 30, 35000);
        staff[1] = new Employee_st("Carl Cracker", 25, 55000);
        staff[2] = new Employee_st("Tony Tester", 40, 38000);

        staff[0].raiseSalary(55);
        staff[2].raiseSalary(52);

        Arrays.sort(staff);
        
        for (Employee_st e : staff)
        {
            System.out.println("name=" + e.getName() + ", age=" + e.getAge() + ", salary=" + e.getSalary());
        }
    }
}