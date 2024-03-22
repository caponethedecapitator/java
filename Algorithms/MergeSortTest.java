public class MergeSortTest
{
    public static void merge(int[] a, int lo, int mid, int hi)
    {
        int i, j, k;
        int m = mid - lo + 1;
        int n = hi - mid;

        int[] leftlist = new int[m];
        int[] rightlist = new int[n];

        for (i = 0; i < m; i++)
        {
            leftlist[i] = a[lo + i];
        }

        for (j = 0; j < n; j++)
        {
            rightlist[j] = a[mid + 1 + j];
        }

        i = 0;
        j = 0;
        k = lo;
        
        while (i < m && j < n)
        {
            if (leftlist[i] <= rightlist[j])
            {
                a[k] = leftlist[i];
                i++;
                k++;
            }

            else if (leftlist[i] > rightlist[j])
            {
                a[k] = rightlist[j];
                j++;
                k++;
            }
        }

        while (i < m && j >= n)
        {
            a[k] = leftlist[i];
            i++;
            k++;
        }

        while (i >= m && j < n)
        {
            a[k] = rightlist[j];
            j++;
            k++;
        }
    }

    public static void mergesort(int[] a, int lo, int hi)
    {
        if (lo >= hi)
        {
            return;
        }

        int mid = lo + (hi - lo) / 2;
        mergesort(a, lo, mid);
        mergesort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    public static void main(String[] args)
    {
        int[] arr = new int[] {12, 11, 10, 5, 6, 7, 3};
        mergesort(arr, 0, arr.length - 1);
        
        for (int i : arr)
        {
            System.out.println(i);
        }
    }
}
