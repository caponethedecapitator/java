package CoreJava;

import java.util.Scanner;

public class GCDTest 
{
    public static int GCD(int num, int i)
    {
        if (i == 0)
        {
            return num;
        }

        return GCD(i, num % i);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int i = input.nextInt();
        System.out.println(GCD(num, i));
        input.close();
    }
}
