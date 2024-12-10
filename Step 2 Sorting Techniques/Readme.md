# __Step 2__ : Sorting Techniques & Algorithms.



### __Lec 1 : Sorting - `I`__

- ### [Selection Sort](#1-selection-sort----try-here)
- ### [Bubble Sort](#2-bubble-sort----try-here) 
- ### [Insertion Sort](#3-insertion-sort----try-here)

&nbsp;

### __Lec 2 : Sorting - `II`__

- ###  [Merge Sort](#4-merge-sort----try-here)
- ###  [Quick Sort](#5-quick-sort----try-here)
- ###  Recursive Bubble Sort
- ###  Recursive Insertion Sort



--- 
&nbsp;

## Lec 1 : Sorting - `I`

### 1. Selection Sort :  &nbsp; [_Try here_](./SelectionSort.java)
### `select Minimum` and `swap` with `first element`.

#### Diagram using arrows and notations :

``` java
1.    64 25 12 22 `11`
      ↑            ↑ - Minimum Element

      [11] 25 12 22 64 - swap
       ↑  

2.    [11] 25 `12` 22 64
           ↑   ↑ - Minimum Element

      [11 12] 25 22 64 - swap
          ↑

3.    [11 12] 25 `22` 64
              ↑   ↑ - Minimum Element

      [11 12 22] 25 64 - swap
              ↑

4.    [11 12 22] 25 64
                 ↑ - Minimum Element

5.    [11 12 22 25] 64 - last element



[11 12 22 25 64] - Sorted Array
    
```

 
#### Explanation :
- Find the `minimum` element in the `unsorted array`.
- `Swap` the `minimum` element with the `first element`.
- `Repeat` the `above steps` for the `remaining array`.

#### Time Complexity : __O(n<sup>2</sup>)__
 - `Best Case` , `Worst Case` & `Average Case` : __O(n<sup>2</sup>)__

#### Space Complexity : __O(1)__


&nbsp;
### Code :

``` java

public void selection_Sort(int[] arr) {

    int n = arr.length;
    // One by one move boundary of unsorted subarray
    // till n-2 elements as n-1 element is already sorted
    for (int i = 0; i <= n - 2; i++) {

        // Default minimum element index
        int min = i;

        // Find the minimum element in unsorted array
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[min]) {
                min = j;
            }
        }
        // Swap the found minimum element with the first element
        swap(arr, min, i);
    }
}

// Swap function
public void swap (int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
```

---

### 2. Bubble Sort :  &nbsp; [_Try here_](./BubbleSort.java)

### Pushes `largest` element to the `end` of the array by `comparing` adjacent elements.

- #### Example :

    Initial Array:
    `[64, 25, 12, 22, 11]`
    
    #### **Step 1:**  
    Compare the first two elements `64` and `25`. Since `25` is smaller, swap them.  
    ```css
    [(64, 25), 12, 22, 11] → [(25, 64), 12, 22, 11]
    ```
    
    #### **Step 2:**  
    Compare the next two elements `64` and `12`. Since `12` is smaller, swap them.  
    ```css
    [25, (64, 12), 22, 11] → [25, (12, 64), 22, 11]
    ```
    
    #### **Step 3:**  
    Compare the next two elements `64` and `22`. Since `22` is smaller, swap them.  
    ```css
    [25, 12, (64, 22), 11] → [25, 12, (22, 64), 11]
    ```
    
    #### **Step 4:**  
    Compare the next two elements `64` and `11`. Since `11` is smaller, swap them.  
    ```css
    [25, 12, 22, (64, 11)] → [25, 12, 22, (11, 64)]
    ```
    
    #### **Step 5:**  
    Repeat the above steps for the remaining array.  
    ```css
    [25, 12, 22, 11] 64 → [11, 12, 22] 25 64  
    [12, 22, 11] 25  64 → [12, 11] 22  25 64 
    [12, 11] 22  25 64  →  11  12  22  25 64  
     
    ```   
    #### **Final Array:**  
    `[11, 12, 22, 25, 64]`



#### Explanation :
- `Compare` the `adjacent elements` and `swap` them if they are in `wrong order`.
- `Repeat` the `above steps` for the `remaining array`.

#### Time Complexity : __O(n<sup>2</sup>)__
 - `Best Case` : __O(n)__ , `Worst Case` & `Average Case` : __O(n<sup>2</sup>)__

#### Space Complexity : __O(1)__

&nbsp;
### Code :

``` java

public void bubble_Sort(int[] arr) {

    int n = arr.length;
    // One by one move boundary of unsorted subarray
    // till n-2 elements as n-1 element is already sorted
    for (int i = n-1; i >=0; i--) {

        // Flag to check if any swapping is done in the inner loop
        boolean swapped = false; // optimization for best case

        // Last i elements are already sorted
        for (int j = 0; j <= i-1; j++) {

            if (arr[j] > arr[j + 1]) {
                swap(arr, j, j + 1);
                swapped = true;
            }
        }
        
       // if no swapping is done, array is already sorted
        if (!swapped) {
            break;
        }
        
    }
}

// Swap function
public void swap (int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
```

---

### 3. Insertion Sort :  &nbsp; [_Try here_](./InsertionSort.java)

### Take an element and `insert` it in the `correct position` in the `sorted array`.


- ####  Example :

  Initial Array:
  `[5, 3, 8, 6, 2]`
  
  
  
  #### **Step 1:**  
  Compare the second element `3` with the first element `5`. Since `3` is smaller, insert it before `5`.  
  
  ```css
  [5, (3), 8, 6, 2] → [(3), 5, 8, 6, 2]
  ```
  
  #### **Step 2:**
  Compare the third element `8` with the previous elements. Since `8` is greater, leave it as it is.  
  
  ```css
  [3, 5, (8), 6, 2] → No Change
  ```
  
  #### **Step 3:**
  Compare the fourth element `6` with the previous elements. Since `6` is smaller, insert it before `8`.  
  
  ```css
  [3, 5, 8, (6), 2] → [3, 5, (6), 8, 2]
  ```
  
  #### **Step 4:**
  Compare the fifth element `2` with the previous elements. Since `2` is smaller, insert it before `3`.  
  
  ```css
  [3, 5, 6, 8, (2)] → [(2), 3, 5, 6, 8]
  ```
  
  #### **Final Array:**  
  `[2, 3, 5, 6, 8]`
              


#### Time Complexity : __O(n<sup>2</sup>)__
 - `Best Case` : __O(n)__ , `Worst Case` & `Average Case` : __O(n<sup>2</sup>)__

#### Space Complexity : __O(1)__

&nbsp;
### Code :

``` java

public void insertion_Sort(int[] arr) {

    int n = arr.length;
    // One by one move boundary of unsorted subarray
    for (int i = 1; i < n; i++) {

        int key = arr[i]; 
        int j = i - 1;

        // Move elements of arr[0..i-1], that are greater than key
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j]; // shift elements to right j → j+1
            j--; // move to previous element
        }

        // Insert the key in its correct position after shifting all elements greater than key
        //as j-- is done extra time to exit the loop hence j+1
        arr[j + 1] = key;
    }
}
```

---

## Lec 2 : Sorting - `II`

### 4. Merge Sort :  &nbsp; [_Try here_](./MergeSort.java)

### `Divide` the array into `two halves` and `merge` them in `sorted order`.

- #### Example :

  Initial Array:
  `[38, 27, 43, 3, 9, 82, 10]`
  
  #### **Step 1:**  
  Divide the array into two halves.  
  `[38, 27, 43, 3]` and `[9, 82, 10]`
  
  #### **Step 2:**  
  Divide the two halves further.  
  `[38, 27]` and `[43, 3]` and `[9, 82]` and `[10]`
  
  #### **Step 3:**  
  Merge the divided arrays in sorted order.  
  `[27, 38]` and `[3, 43]` and `[9, 82]` and `[10]`
  
  #### **Step 4:**  
  Merge the divided arrays in sorted order.  
  `[3, 27, 38, 43]` and `[9, 10, 82]`
  
  #### **Step 5:**  
  Merge the divided arrays in sorted order.  
  `[3, 9, 10, 27, 38, 43, 82]`
  
  #### **Final Array:**  
  `[3, 9, 10, 27, 38, 43, 82]`

#### Tree diagram of Merge Sort :

``` java
 [38, 27, 43, 3, 9, 82, 10]
                ↓
[38, 27, 43, 3]  [9, 82, 10]
        ↓               ↓
[38, 27] [43, 3]  [9, 82]   [10]
    ↓        ↓         ↓      ↓
[38] [27] [43] [3]  [9] [82] [10]  // Base Case : Single Element
    ↓         ↓        ↓      ↓  
[27, 38]   [3, 43]  [9, 82] [10]   // Merge and Sort
    ↓         ↓        ↓
   [3, 27, 38, 43]   [9, 10, 82]
      ↓                ↓
    [3, 9, 10, 27, 38, 43, 82]    // Final Sorted Array
```

#### Binary tree of Merge sort :
    
 ``` java
                 [38, 27, 43, 3, 9, 82, 10]
                         /           \
             [38, 27, 43, 3]       [9, 82, 10]
             /          \            /       \
         [38, 27]    [43, 3]      [9, 82]   [10]
         /     \      /    \      /    \     |   
       [38]  [27]   [43]  [3]    [9]  [82]  [10]  // Base Case : Single Element
         \     /      \    /      \    /     |    
         [27, 38]    [3, 43]      [9, 82]   [10]  // Merge and Sort
             \         /             \       /
             [3, 27, 38, 43]       [9, 10, 82]
                     \                 /
                 [3, 9, 10, 27, 38, 43, 82]       // Final Sorted Array
 ```
#### Time Complexity : __O(n log n)__
 - `Best Case` , `Worst Case` & `Average Case` : __O(n log n)__

#### Space Complexity : __O(n)__

&nbsp;
### Code :

``` java

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
```

---

### 5. Quick Sort :  &nbsp; [_Try here_](./QuickSort.java) 

### `Divide` the array into `two halves` and `sort` them using `pivot element`.

- #### Example pivot element : `first element`

    Initial Array:
    `[38, 27, 43, 3, 9, 82, 10]`
    
    #### **Step 1:**  
    Select the first element `38` as the pivot element.  
    `[27, 3, 9, 10]` and `[38]` and `[43, 82]`
    
    #### **Step 2:**  
    Select the first element `27` as the pivot element.  
    `[3, 9, 10]` and `[27]` and `[38]` and `[43, 82]`
    
    #### **Step 3:**  
    Select the first element `3` as the pivot element.  
    `[3]` and `[9, 10]` and `[27]` and `[38]` and `[43, 82]`
    
    #### **Step 4:**  
    Select the first element `9` as the pivot element.  
    `[3]` and `[9]` and `[10]` and `[27]` and `[38]` and `[43, 82]`
    
    #### **Step 5:**  
    Select the first element `43` as the pivot element.  
    `[3]` and `[9]` and `[10]` and `[27]` and `[38]` and `[43]` and `[82]`
    
    #### **Final Array:**  
    `[3, 9, 10, 27, 38, 43, 82]`

#### Time Complexity : __O(n log n)__

- `Best Case` : __O(n log n)__ , `Worst Case` : __O(n<sup>2</sup>)__ , `Average Case` : __O(n log n)__


#### Space Complexity : __O(log n)__

&nbsp;
### Code :

``` java

public static void quick_Sort(int[] arr, int low, int high) {

        if (low < high) {

            // Find pivot element such that
            // elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            int pivot = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quick_Sort(arr, low, pivot - 1);
            quick_Sort(arr, pivot + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[low]; // Select first element as pivot
        int i = low; // Index of smaller element

        for (int j = low + 1; j <= high; j++) {

            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++; // Increment index of smaller element
                swap(arr, i, j);
            }
        }

        // Swap pivot element with the element at index i-1
        swap(arr, low, i);

        return i; // Return the index of pivot element
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
```

---

#### Table of Comparison :

| Algorithm | Best  Case | Worst Case | Average Case | Space Complexity |
| --- | --- | --- | --- | --- |
| Selection Sort | O(n<sup>2</sup>) | O(n<sup>2</sup>) | O(n<sup>2</sup>) | O(1) |
| Bubble Sort | O(n) | O(n<sup>2</sup>) | O(n<sup>2</sup>) | O(1) |
| Insertion Sort | O(n) | O(n<sup>2</sup>) | O(n<sup>2</sup>) | O(1) |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) | O(n) |
| Quick Sort | O(n log n) | O(n<sup>2</sup>) | O(n log n) | O(log n) |

---

#### Table of short notes :

| Algorithm | Short Note |
| --- | --- |
| Selection Sort | `Select minimum` element and swap with first element. |
| Bubble Sort | `Pushes largest element` to the end by comparing adjacent elements. |
| Insertion Sort | Insert element in correct position in sorted array. |
| Merge Sort | `Divide array into two halves` and merge them in sorted order. |
| Quick Sort | Divide array into two halves and `sort them using pivot element`. |

---

