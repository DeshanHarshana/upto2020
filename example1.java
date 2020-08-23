
class Example1 {
    public static void main(String[] args) {
        int marks[] = { 56, 67, 34, 90, 57, 89 };
        addMarks(marks, 40);
        int x=print(marks);
    }

    static void addMarks(int m[], int b) {
        for (int i = 0; i < m.length; i++) {
            // m[i] = m[i] >= 100 ? 100 : m[i]+b; //Ternary Operator
            if (m[i] + b >= 100)
                m[i] = 100;
            else
                m[i] = m[i] + b;

        }
    }

    void print(int x[]) {
        for (int v : x)
            System.out.print(v + " ");
    }
}