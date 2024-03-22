public class InsertionSortTest
{
    public static void insertionsort(int[] arr)
    {
        int i;
        int j;
        int temp;

        for (i = 1; i < arr.length; i++)
        {
            temp = arr[i];
            j = i - 1;

            while (j >= 0 && temp < arr[j])
            {
                arr[j + 1] = arr[j];
                j--;
            }
            
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args)
    {
        int[] a = new int[] {12, 11, 10, 5, 6, 7, 3};
        insertionsort(a);

        for (int i : a)
        {
            System.out.println(i);
        }
    }
}
