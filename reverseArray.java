public class reverseArray {
    public static void main(String[] args) {
        int array[]={1,2,3,4,2,3};
        for(int i=array.length-1; i>=0; i--)
            System.out.print(array[i]+" : ");

    }
    static void print(int x[]){
        for(int v:x)
            System.out.print(v+" ");
    }
}