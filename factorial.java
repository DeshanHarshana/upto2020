public class factorial {
    public static void main(String[] args) {
        System.out.println(factoriall(5));
        System.out.println(nontail(5));
        System.out.println(tail(5,1));
    }
    private static int factoriall(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact=fact*i;
        }
        return fact;
    }
    private static int nontail(int n){
        if(n==1)
            return 1;
        else
            return n*nontail(n-1);
    }
    private static int tail(int n, int k){
        if(n==1)
            return k;
        else
            return tail(n-1, k*n);
    }
}