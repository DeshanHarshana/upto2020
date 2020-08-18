package Algorithem;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int A[]={1,3,2,4,2,2,3,1,0};
        long x=System.currentTimeMillis();
        System.out.println(Arrays.toString(insertion_Sort(A)));
        long y=System.currentTimeMillis();
        System.out.println(y-x);
       
    }
    private static int[] insertion_Sort(int arr[]){
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        }
        return arr;
    }
}