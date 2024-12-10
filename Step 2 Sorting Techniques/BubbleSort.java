public class BubbleSort {

    public static void bubble_Sort(int[] arr) {

        int n = arr.length;

        for (int i = n-1; i >=0; i--) {
    
            boolean swapped = false; // optimization for best case
    
            for (int j = 0; j <= i-1; j++) {
    
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) { // if no swapping is done, array is already sorted
                break;
            }
        }
    }

    // Swap function
public static void swap (int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

    public static void main(String args[]) {

        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before bubble sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubble_Sort(arr);
    }
    
}
