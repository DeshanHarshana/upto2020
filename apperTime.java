

public class apperTime {
    public static void main(String[] args) {
        int x[]={1,2,2,1,3,1};
       apper(x);
    }
    private static void apper(int arr[]){
        int t[]=removeDup(arr);
        int count=0;
        for(int i=0; i<t.length; i++){
            for(int j=0; j<arr.length; j++){
                if(t[i]==arr[j]){
                    count++;
                }
            }
            System.out.println(t[i] + "Contains " + count + " times");
            count=0;
        }
        
    }
    
    private static int[] removeDup(int arr[]){
        bubbleSort(arr);
        int count=1;
        for(int i=0; i<arr.length-1; i++){
            if(!(arr[i]==arr[i+1])){
                count++;
            }
        }
        int nondup[]=new int[count];
        nondup[0]=arr[0];
        int index=1;
        for(int i=0; i<arr.length-1; i++){
            if(!(arr[i]==arr[i+1])){
                nondup[index]=arr[i+1];
                index++;
            }
        }
        return nondup;
    }
   
    private static void bubbleSort(int a[]){
        for(int k=0; k<a.length; k++){
            for(int i=0; i<a.length-k-1; i++){
                if(a[i]>a[i+1]){
                    int temp=a[i+1];
                    a[i+1]=a[i];
                    a[i]=temp;
                }
            }
        }
    }
}