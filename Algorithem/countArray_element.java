package Algorithem;

import java.sql.Time;
import java.util.Arrays;

public class countArray_element {
    public static void main(String[] args) {
        int arr[]={3,6,4,1,3,4,1,4,8,9,0,0,7};//only positive value
        long x=System.currentTimeMillis();
        count_array2(arr);
        long y=System.currentTimeMillis();
        System.out.println(y-x);
    }
    private static int[] count_array(int A[]){
        int count[]=new int[max_value(A)+1];
        for(int i=0; i<count.length; i++){
            count[i]=0;
        }
        for(int i=0; i<count.length; i++){
            for(int j=0; j<A.length; j++){
                if(A[j]==i){
                    count[i]++;
                }
            }
        }
        return count;
    }
    private static void count_array2(int A[]){
        System.out.println("Unsorted Array =            "+Arrays.toString(A));
        int C[]=new int[max_value(A)+1];
        
        int B[]=new int[A.length];
        for(int i=0; i<C.length; i++){
            C[i]=0;
        }
        System.out.println("New Count array initially 0 "+Arrays.toString(C));
        for(int i=0; i<A.length; i++){
            C[A[i]]++;
            //we can use one for loop
            //we find index value and increase it
        }
        System.out.println("count of value               "+Arrays.toString(C));
       
        for(int i=1; i<C.length; i++){
            C[i]=C[i]+C[i-1];
        }
        System.out.println("cumulative count of value     "+Arrays.toString(C));
        for(int i=A.length-1; i>=0; i--){
            B[C[A[i]]-1]=A[i]; //
            C[A[i]]--;
        }
        System.out.println("After down Count array         " +Arrays.toString(C));
        System.out.println("Sorted Array                   "+Arrays.toString(B));
        
    }
   
    private static int max_value(int A[]){
        int max=0;
        for(int i=0; i<A.length; i++){
            if(A[i]>max){
                max=A[i];
            }
        }
        return max;
    }
}