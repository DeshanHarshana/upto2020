class f{ 
    public static void main(String[] args) {
        child c=new child();
        System.out.println(c.myMet());
        

    }
    
}
class student{
    final int myMet(){
        return 6;
    }
}
class child extends student{
    @Override
    int myMet(){
        return 10;
    }
}