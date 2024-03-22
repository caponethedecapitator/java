public class SelectionSortTest 
{
    public static void selectionsort(int[] arr)
    {
        int i;
        int j;
        int min;
        int temp;
        
        for (i = 0; i < arr.length - 1; i++)
        {
            min = i;

            for (j = i; j < arr.length; j++)
            {
                if (arr[min] > arr[j])
                {
                    min = j;
                }
            }

            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }    

    
    public static void main(String[] args)
    {
        int[] a = new int[] {12, 11, 10, 5, 6, 7, 3};
        selectionsort(a);

        for (int i : a)
        {
            System.out.println(i);
        }
    }
}
