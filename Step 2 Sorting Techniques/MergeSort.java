public class MergeSort {
    public static void main(String[] args) {

        int[] arr = { 12, 11, 13, 5, 6, 7 };
        System.out.println("Given Array");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        merge_Sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void merge_Sort(int[] arr, int start, int end) {

        if (start == end) {  // Base case: If array has only one element
            return;
        }

        // Find the middle point to divide the array into two halves
        int mid = (start + end) / 2;

        // Call merge_Sort for first half
        merge_Sort(arr, start, mid);

        // Call merge_Sort for second half
        merge_Sort(arr, mid + 1, end);

        // Merge the two halves
        merge(arr, start, mid, end);

    }

    public static void merge(int[] arr, int start, int mid, int end) {

        // Create temporary arrays
        int[] temp = new int[end - start + 1];

        int left = start; // Initial index of first subarray
        int right = mid + 1; // Initial index of second subarray

        // Index for temp array
        int k = 0;

        while (left <= mid && right <= end) {

            if (arr[left] <= arr[right]) {
                temp[k] = arr[left];
                left++; // Increment left index

            } else {
                temp[k] = arr[right];
                right++; // Increment right index
            }

            k++; // Increment index of temp array
        }

        // Copy remaining elements of left array
        while (left <= mid) {
            temp[k] = arr[left];
            left++;
            k++;
        }

        // Copy remaining elements of right array
        while (right <= end) {
            temp[k] = arr[right];
            right++;
            k++;
        }

        // Copy the sorted array to original array
        for (int i = start; i <= end; i++) {
            arr[i] = temp[i - start];
        }

    }

}
