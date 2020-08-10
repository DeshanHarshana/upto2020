class average{
    public static void main(String[] args) {
        int arr[][]=
        {
            {3,3,1},
            {3,2,3}
        };
        System.out.println(avg(arr));
        
    }
    private static double avg(int a[][]){
        double sum=0;
        double count=0;
        for(int i=0; i<a.length; i++){
            for(int x:a[i])
                {
                    sum=sum+x;
                    count++;
                }
        }
        
        return sum/count;
    }
}