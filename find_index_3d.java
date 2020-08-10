public class find_index_3d {
    public static void main(String[] args) {
        int arr[][][]={
            {
                {1,2,3,4},
                {5,6,7,8}
            },
            {
                {9,10,11,12},
                {13,14,15,16}
            }
        };
        System.out.println(findIndex(arr, 14));
    }
    private static String findIndex(int a[][][], int val){
        String index="";
        int i=0;
        int j=0;
        int k=0;
        for(int x[][]:a){
            i++;
            for(int y[]:x){
                j++;
                for(int z:y){
                    k++;
                    if(z==val){
                        index=i+":"+j+":"+k;
                    }
                }
            }
        }
        return index;
    }
}