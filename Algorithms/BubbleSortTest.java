public class BubbleSortTest 
{
    public static void bubblesort(int[] arr)
    {
        int i;
        int j;
        int temp;
        boolean isFinished;
        
        for (i = 0; i < arr.length - 1; i++)
        {
            isFinished = true;

            for (j = 0; j < arr.length - 1; j++)
            {
                
                if (arr[j] > arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isFinished = false;
                }
            }

            if (isFinished == true)
            {
                break;
            }
        }

    }
    
    public static void main(String[] args)
    {
        int[] a = new int[] {12, 11, 10, 5, 6, 7, 3};
        bubblesort(a);

        for (int i : a)
        {
            System.out.println(i);
        }
    }
}
