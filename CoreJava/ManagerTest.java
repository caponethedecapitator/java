package CoreJava;

import java.util.*;
class Employee_a
{
    private String name = " ";
    private int age = 0;
    private double salary = 0.0;
    public Employee_a(String name, int age, double salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public Employee_a()
    {

    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public double getSalary()
    {
        return salary;
    }
}
class Manager extends Employee_a
{
    private double bonus;
    public Manager(String name, int age, double salary, double bonus)
    {
        super(name, age, salary);
        this.bonus = bonus;
    }
    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }
    public double getBonus()
    {
        return bonus;
    }
}
public class ManagerTest
{
    public static void main(String[] args)
    {
        var boss = new Manager(" ", 0, 0.0, 0.0);
        var input = new Scanner(System.in);
        System.out.println("Please enter the name:");
        boss.setName(input.nextLine());
        System.out.println("Please enter the age:");
        boss.setAge(input.nextInt());
        System.out.println("Please enter the salary:");
        boss.setSalary(input.nextDouble());
        System.out.println("Please enter the bonus:");
        boss.setBonus(input.nextDouble());
        input.close();
        var boss_sb = new StringBuilder("Name:");
        boss_sb.append(boss.getName());
        boss_sb.append(", Age:");
        boss_sb.append(boss.getAge());
        boss_sb.append(", Salary:");
        boss_sb.append(boss.getSalary());
        boss_sb.append(", Bonus:");
        boss_sb.append(boss.getBonus());
        System.out.println(boss_sb.toString());
    }
}