public class maximum_minumum_2d_array {
    public static void main(String[] args) {
        int arr[][]={
            {1,2,9,4},
            {0,3,2,4},
            {1,4,3,2}
        };
        max_min(arr);;
    }
    private static void max_min(int arr[][]){
        int max=0;
        int min=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        System.out.println("Max : " + max + " " + "Min : " + min);
    }
}