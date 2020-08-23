
class sen {
   public String name;
   public double marks;
public sen(String n, double m)
{
    name=n;
    marks=m;
}
char getGrade()
{
    char g='F';
    if (marks>=75) g='A';
    else if(marks>=65) g='B';
    else if(marks>=50) g='P';
    else g='F';
    return g;
}
public void print()
{
    System.out.println(name+marks);
    System.out.println(getGrade());
}
public void addMarks(double m)
{
    marks=marks+m;
    if(marks>100)
        marks=100;
}
}
class senArray{
    static void print(sen []s)
    {
        for(int i=0; i<s.length; i++)
            s[i].print();
    }
    public static void main(String a[]) {
        sen [] all=new sen[5];
        all[0]= new sen("A", 41);
        all[1]= new sen("b", 52);
        all[2]= new sen("c", 89);
        all[3]= new sen("d", 56);
        all[4]= new sen("e", 45);
        System.out.println("intial maks");
        print(all);

    }


}
