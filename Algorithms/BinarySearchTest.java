import java.util.Arrays;

public class BinarySearchTest 
{
    public static int IterativeBinarySearch(int[] arr, int val)
    {
        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi)
        {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] < val)
            {
                lo = mid + 1;
            }

            else if (arr[mid] > val)
            {
                hi = mid - 1;
            }

            else if (arr[mid] == val)
            {
                return mid;
            }
        }

        return -1;
    }

    public static int RecursiveBinarySearch(int[] arr, int val, int lo, int hi)
    {
        int mid = lo + (hi - lo) / 2;

        if (lo > hi)
        {
            return -1;
        }

        if (arr[mid] == val)
        {
            return mid;
        }

        else if (arr[mid] < val)
        {
            return RecursiveBinarySearch(arr, val, mid + 1, hi);
        }

        return RecursiveBinarySearch(arr, val, lo, mid - 1);
    }
    public static void main(String[] args)
    {
        int[] a = new int[] {8, 3, 6, 10, 12};
        Arrays.sort(a);
        System.out.println(IterativeBinarySearch(a, 8));
        System.out.println(RecursiveBinarySearch(a, 8, 0, a.length - 1));
    }
}
