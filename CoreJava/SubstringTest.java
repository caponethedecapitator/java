package CoreJava;

public class SubstringTest
{
    public static void main(String args[])
    {
        String greeting = "Hello";
        System.out.println(greeting);
        int n = greeting.length();
        int cpCount = greeting.codePointCount(0, greeting.length());
        System.out.println(cpCount);
        System.out.println(n);
        String s = greeting.substring(0, 3);
        System.out.println(s);
        String Help = s + "p!";
        System.out.println(Help);
        System.out.println("Hello".equals(greeting));
        System.out.println("Hello!".equals(greeting));
        System.out.println("Hello".equalsIgnoreCase("hello"));
    }
}