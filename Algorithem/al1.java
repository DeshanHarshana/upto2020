package Algorithem;

public class al1 {
   public static void main(String[] args) {
       System.out.println(result(6));
   } 
   private static int result(int n){
        if(n==1)
            return 2;
        else
            return 2*result(n-1);
   }
}