package Algorithem;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int A[]={1,3,4,3,4,3,5,3,2,3,4,2,3,4,3,2,3,4,2,21,3,3,2,1,2,4,2,2,3,1,0};
        System.out.println(Arrays.toString(bubble_Sort(A)));
    }
    private static int[] bubble_Sort(int A[]){
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A.length-i-1; j++){
                if(A[j]>A[j+1]){
                    int tem=A[j+1];
                    A[j+1]=A[j];
                    A[j]=tem;
                }
            }
        }
        return A;

    }
}