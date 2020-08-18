package Algorithem;

public class binarySearch {
    public static void main(String[] args) {
        int A[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println(binary_Search(A, 5));
    }

    private static int binary_Search(int arr[], int x) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r-1) / 2; 
  
            // Check if x is present at mid 
            if (arr[m] == x) 
                return m; 
  
            // If x greater, ignore left half 
            else if (arr[m] < x) 
                l = m + 1; 
  
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 
  
        // if we reach here, then element was 
        // not present 
        return -1; 
    } 
}