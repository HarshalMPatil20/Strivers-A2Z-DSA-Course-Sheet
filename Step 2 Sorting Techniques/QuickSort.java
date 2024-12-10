public class QuickSort {

    public static void main(String[] args) {
        int[] arr = { 10, 80, 30, 90, 40, 50, 70 };
        System.out.println("Given Array");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        quick_Sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void quick_Sort(int[] arr, int low, int high) {

        if (low < high) {

            
            int pivot = partition(arr, low, high);

            quick_Sort(arr, low, pivot - 1);
            quick_Sort(arr, pivot + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[low]; 
        int i = low; 

        for (int j = low + 1; j <= high; j++) {

            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
                 
            }
        }

        // Swap pivot element with the element at index i-1
        swap(arr, low, i );

        return i; // Return the index of pivot element
    }


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}
