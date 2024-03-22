package CoreJava;

import java.util.*;
public class RaggedArray {
    public static void main(String[] args)
    {
        System.out.println("Please enter a number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int i = 0, j = 0;
        int[][] a = new int[num][num];
        input.close();
        {
            for (i = 0; i < a.length;i++)
            {
                for (j = 0; j <= i;j++)
                {
                    if (j == i)
                    {
                        a[i][j] = 1;
                        System.out.printf(a[i][j] + "\n");
                    }
                    else if (j == 0)
                    {
                        a[i][j] = 1;
                        System.out.printf(a[i][j] + " ");
                    }
                    else if(i >= 1 && j >= 1)
                    {
                        a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
                        System.out.printf(a[i][j] + " ");
                    }
                }
            }
        }
    }
}