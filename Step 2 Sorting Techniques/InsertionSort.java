public class InsertionSort {

    public static void insertion_Sort(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String args[]) {

        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before insertion sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        insertion_Sort(arr);
        System.out.println("After insertion sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}