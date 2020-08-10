
public class sum_of_n_number {
    public static void main(String[] args) {
        System.out.println(sumOf(3));
        System.out.println(nontail(3));
        System.out.println(tail(3, 1));
    }

    private static int sumOf(int i) {
        int sum=0;
        for(int x=1; x<=i; x++){
            sum+=x;
        }
        return sum;
    }

    private static int nontail(int n){
        if(n==0 | n==1)
            return 1;
        else
            return n+nontail(n-1);
    }

    private static int tail(int n,int k){
        if(n==0 | n==1)
            return k;
        else
            return tail(n-1, k+n);
    }
}