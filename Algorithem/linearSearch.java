package Algorithem;

public class linearSearch {
    public static void main(String[] args) {
        int A[]={2,3,4,1};
        System.out.println(linear_Search(A, 1));

    }
    private static int linear_Search(int A[], int val){
        int i=0;
        int index=0;
        while(i<A.length){
            index=i;
            i++;
        }
        return index;
    }
}