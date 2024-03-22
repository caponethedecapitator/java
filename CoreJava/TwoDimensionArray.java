package CoreJava;

import java.util.*;
public class TwoDimensionArray
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please specify the row:");
        int row = input.nextInt();
        if (row <= 0 || row >= 100)
        {
            System.out.println("Wrong number!");
            input.close();
            return;
        }
        System.out.println("Please specify the column:");
        int column = input.nextInt();
        if (column <= 0 || column >= 100)
        {
            System.out.println("Wrong number!");
            input.close();
            return;
        }
        int i = 0, j = 0;
        int[][] a = new int[row][column];
        input.nextLine();
        System.out.println("Ascending order or descending order? [A/D]");
        String str = input.nextLine();
        input.close();
        if (str.equalsIgnoreCase("A"))
        {
            for (i = 0;i < a.length;i++)
            {
                for (j = 0;j < a[0].length;j++)
                {
                    a[i][j] = column * i + 1 + j;
                    System.out.printf(a[i][j] + " ");
                }
                System.out.printf("\n");
            } 
            System.out.println("This is the ascending array output.");
        }
        else if (str.equalsIgnoreCase("D"))
        {
            for (i = row - 1;i >= 0;i--)
            {
                for (j = column - 1;j >= 0;j--)
                {
                    a[i][j] = column * i + 1 + j;
                    System.out.printf(a[i][j] + " ");
                }
                System.out.printf("\n");
            }
            System.out.println("This is the descending array output.");
        }
        else
        {
            System.out.println("Wrong specification!");
            return;
        }
    }
}