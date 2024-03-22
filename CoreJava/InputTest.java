package CoreJava;

import java.util.*;
public class InputTest {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = in.nextLine();
        System.out.println("My name is " + name);
        System.out.println("How old are you?");
        int age = in.nextInt();
        System.out.println("I'm " + age);
        in.close();
    }        
}