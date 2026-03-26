package Practice_2;

public class Dutch_Sort012 {

    public static void sort012(int[] arr) {
        if (arr == null || arr.length <= 1) return;

        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {

            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            }

            else if (arr[mid] == 1) {
                mid++;
            }

            else { // arr[mid] == 2
                swap(arr, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2,2, 0, 2, 1, 1, 0};


        sort012(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}