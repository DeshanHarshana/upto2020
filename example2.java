class example2 {
    static int x=0;
    public static void main(String[] args) {
        
    }
    static void vv(){
        example2 c2=new example2();
        c2.rr();
    }
    void rr(){
        
    }
}
class student{
    String name="";
    int marks=0;

    student(String name, int marks){
        this.name=name;
        this.marks=marks;
    }
    static String getGrade(int m){
        
        String grade="";
        if(m > 75)
        {
            grade = "A";
        }
        else if(m > 65)
        {
            grade = "B";
        }
        else if(m >= 35)
        {
            grade = "P";
        }
        else(m >= 35)
        {
            grade = "F";
        }
        return grade;
    }
    void addMarks(int m){
        marks+=m;
        if(marks>100){
            marks=100;
        }
    }
    void print(){
        System.out.println("name " + name + "marks" + marks + "grade" + getGrade(marks));
    }
}