package CoreJava;

import java.util.Scanner;

public class IsPrimeTest
{
    public static boolean IsPrime(int num, int i)
    {
        if (num < 2)
        {
            return true;
        }

        
        if (num % i != 0)
        {
            if (i == num - 1)
            {
                return true;
            }

            else
            {
                return IsPrime(num, i + 1);
            }
        }

        return false;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numtest = input.nextInt();
        System.out.println(IsPrime(numtest, 2));
        input.close();
    }
}