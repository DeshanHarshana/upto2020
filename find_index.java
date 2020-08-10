public class find_index {
    public static void main(String[] args) {
       System.out.println(find_id(new int[]{1,2,3,4,5}, 5));
    }
    private static int find_id(int a[], int val){
        int index=0;
        for(int i=0; i<a.length; i++){
            if(a[i]==val){
                index=i;
                break;
            }
            
        }
        return index;
    }
}