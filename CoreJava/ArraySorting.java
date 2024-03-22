package CoreJava;

import java.util.*;
public class ArraySorting
{
    public static void main(String[] args)
    {
        System.out.println("This is a testing program for array sorting.\n");
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int dsg_num = input.nextInt();
        System.out.println("Which number is the maximum number?");
        int max_num = input.nextInt();
        input.close(); 
        int i = 0;
        int[] a = new int[dsg_num];
        Random rand = new Random();
        for (i = 0; i < a.length; i++)
        {
            a[i] = rand.nextInt(max_num);
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("The designated array has been sorted.");
    }
}
