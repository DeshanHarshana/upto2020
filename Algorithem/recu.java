package Algorithem;


    class Recursion2 {
    public static void main(String args[])
    {
        Recursion2  r=new  Recursion2();
        r.upAndDown(1);
        System.out.println('E');
    }

    public void upAndDown(int n)
    {
        System.out.print("\nLevel: " + n);
        if (n < 4)
            upAndDown (n+1);
       
        System.out.println("LEVEL : " + n);
    }
}
