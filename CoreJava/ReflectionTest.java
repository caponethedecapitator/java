package CoreJava;

import java.util.*;
import java.lang.reflect.*;

public class ReflectionTest
{
    public static void printFields(Class cl)
    {
        Field[] fields = cl.getDeclaredFields();

        for (Field f : fields)
        {
            Class type = f.getType();
            String name = f.getName();
            
            System.out.print("  ");
            
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0)
            {
                System.out.print(modifiers + " ");
            }
            
            System.out.println(type.getName() + " " + name + ";");
        }
    }

    public static void printMethods(Class cl)
    {
        Method[] methods = cl.getDeclaredMethods();

        for (Method m : methods)
        {
            Class retType = m.getReturnType();
            String name = m.getName();
            
            System.out.print("  ");
            
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0)
            {
                System.out.print(modifiers + " ");
            }

            System.out.print(retType.getName() + " " + name + "(");

            Class[] paramTypes = m.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++)
            {
                if (j > 0)
                {
                    System.out.print(", ");
                }
                System.out.print(paramTypes[j].getName());
            }

            System.out.println(");");
        }
    }

    public static void printConstructors(Class cl)
    {
        Constructor[] constructors = cl.getDeclaredConstructors();

        for (Constructor c : constructors)
        {
            String name = c.getName();

            System.out.print("  ");

            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0)
            {
                System.out.print(modifiers + " ");
            }

            System.out.print(name + "(");

            Class[] paramTypes = c.getParameterTypes();
            for (int j = 0; j < paramTypes.length ; j++)
            {
                if (j > 0)
                {
                    System.out.print(", ");
                }
                System.out.print(paramTypes[j].getName());
            }

            System.out.println(");");
        }
    }

    public static void main(String[] args)
        throws ReflectiveOperationException
    {
        String name;
        
        if (args.length > 0)
        {
            name = args[0];
        }

        else
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter class name:");
            name = in.next();
            in.close();
        }

        Class cl = Class.forName(name);
        Class supercl = cl.getSuperclass();

        String modifiers = Modifier.toString(cl.getModifiers());
        if (modifiers.length() > 0)
        {
            System.out.print(modifiers + " ");
        }
        System.out.print("class " + name);
        
        if (supercl != null && supercl != Object.class)
        {
            System.out.print(" extends " + supercl.getName());
        }

        System.out.print("\n{\n");
        printConstructors(cl);
        System.out.println();
        printMethods(cl);
        System.out.println();
        printFields(cl);
        System.out.println("}");
    }
}

class Employee_rt
{
    private String name = " ";
    private int age = 0;
    private double salary = 0.0;
    
    public Employee_rt(String name, int age, double salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    public Employee_rt()
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

class Manager_rt extends Employee_rt
{
    private double bonus;
    
    public Manager_rt(String name, int age, double salary, double bonus)
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