public class QuickSortTest 
{
    public static void main(String[] args){
        int[] arr = new int[]{8, 7, 6, 5, 4, 3, 2, 1};
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        for (int num : arr){
            System.out.println(num);
        }
    }

    public static void quickSort(int[] arr, int left, int right){
        int n = arr.length;
        if (n == 1 || left >= right){
            return;
        }
        int pivot = arr[left];
        int l = left + 1;
        int r = right;
        while (l <= r){
            while (l <= r && arr[r] > pivot){
                r--;
            } 
            while (l <= r && arr[l] < pivot){
                l++;
            }

            if (l < r){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }

        arr[left] = arr[r];
        arr[r] = pivot;

        quickSort(arr, left, r - 1);
        quickSort(arr, r + 1, right);
    }
}
