package Algorithem;



class count {
    
    public static void main(String[] args) {
        System.out.println(countDigit(0));
    }
   
        static int countDigit(int n) 
        { 
            if (n == 0) 
                return 0;
            else 
                return 1 + countDigit(n / 10); 
        } 
    }
