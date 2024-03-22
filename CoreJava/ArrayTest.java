package CoreJava;

import java.util.*;
public class ArrayTest
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        int i = 0;
        int[] a = new int[10];
        if (n >= 10 || n < 0)
        {
            System.out.println("The number is wrong. Please enter another one.");
        }
        for(i = 0;i <= n;i++)
        {
            a[i] = i;
            if (i < n)
            {
                System.out.printf(a[i] + ", ");
            }
            else if (i == n)
            {
                System.out.printf(a[i] + "\n");
            }
        }

    }
}