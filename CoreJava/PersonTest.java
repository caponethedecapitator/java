package CoreJava;

abstract class Person
{
    public abstract String getDescription();
    private String name = " ";
    private int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }
}

class Employee_pt extends Person
{
    private double salary;
    
    public Employee_pt(String name, int age, double salary)
    {
        super(name, age);
        this.salary = salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public double getSalary()
    {
        return salary;
    }

    public String getDescription()
    {
        return "This employee is called " + getName() + ", is aged " + getAge() + ", and earns " + getSalary() + " per month.";
    }
}

class Student_pt extends Person
{
    private String major = " ";
    
    public Student_pt(String name, int age, String major)
    {
        super(name, age);
        this.major = major;
    }

    public void setMajor()
    {
        this.major = major;
    }

    public String getMajor()
    {
        return major;       
    }

    public String getDescription()
    {
        return "This student is called " + getName() + ", is aged " + getAge() + ", and selects " + getMajor() + " as major.";
    }
}

public class PersonTest
{
    public static void main(String[] args)
    {
        var people = new Person[2];
        people[0] = new Employee_pt("Harry Hacker", 50, 50000);
        people[1] = new Student_pt("Maria Morris", 20, "computer science");
        for (Person p : people)
        {
            System.out.println(p.getDescription());
        }
    }
}