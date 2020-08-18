package Algorithem;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int A[]={1,3,2,4,2,2,3,1,0};
        System.out.println(Arrays.toString(selection_Sort(A)));
    }
    private static int[] selection_Sort(int[] A){
        int B[]=new int[A.length];
        for(int i=0; i<A.length; i++){
            int min_val=Integer.MAX_VALUE;
            int min_index=0;
            for(int j=0; j<A.length; j++){
                if(A[j]<min_val){
                    min_val=A[j];
                    min_index=j;
                }
            }
            B[i]=min_val;
            A[min_index]=Integer.MAX_VALUE;
        }
        return B;
    }
}