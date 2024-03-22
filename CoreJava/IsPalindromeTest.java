package CoreJava;

import java.util.Scanner;

public class IsPalindromeTest
{
    public static boolean IsPalindrome(String str, int lo, int hi)
    {
    if (str.length() == 0 || str.length() == 1)
    {
        return true;
    }

    if (str.charAt(lo) == str.charAt(hi))
    {
        if (lo == hi || lo == hi - 1)
        {
            return true;
        }
    
        else
        {
            return IsPalindrome(str, lo + 1, hi - 1);
        }
    }
    return false;
}

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String strtest = input.nextLine();
        System.out.println(IsPalindrome(strtest, 0, strtest.length() - 1));
        input.close();
    }
}
