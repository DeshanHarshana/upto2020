public class fibonaci {
    public static void main(String[] args) {
        System.out.println(fibonacii(14));
        System.out.println(nontailFib(14));
        System.out.println(tailFib(14,1));
    }
    private static int fibonacii(int n){
        int fib1=1;
        int fib2=0;
        int fib3=0;
        for(int i=0;i<n;i++){
            fib3=fib1+fib2;
            fib1=fib2;
            fib2=fib3;
        }
        return fib3;
    }
    private static int nontailFib(int n){
        if(n==0)
            return 0;
        if(n==1|n==2)
            return 1;
        else
            return nontailFib(n-1)+nontailFib(n-2);
    } 
    private static int tailFib(int n, int k){
        if(n==0)
            return 0;
        if(n==1 | n==2)
            return k;
        else
            return tailFib(n-1, k)+ tailFib(n-2, k);
    }  
}