public class Progression {
    protected long current;

    public Progression(){
        this(0);
    }

    
    public Progression(long start){
        current = start;
    }

    public long nextValue(){
        long answer = current;
        advance();
        return answer;
    }

    protected void advance(){
        current++;
    }

    public void printProgression(int n){
        System.out.println(nextValue());
        for(int j=1; j<n; j++)
            System.out.println(nextValue());
        System.out.println();
    }
}

class ArithmeticProgression extends Progression{
    protected long increment;

    public ArithmeticProgression(){
        this(1, 0);
    }

    public ArithmeticProgression(long stepsize){
        this(stepsize, 0);
    }

    public ArithmeticProgression(long stepsize, long start){
        super(start);
        increment = stepsize;
    }

    protected void advance(){
        current += increment;
    }
}

class GeometricProgression extends Progression{
    protected long base;

    public GeometricProgression(){
        this(2, 1);
    }

    public GeometricProgression(long base){
        this(base, 1);
    }

    public GeometricProgression(long base, long start){
        super(start);
        this.base = base;
    }

    protected void advance(){
        current *= base;
    }
}

class FibonacciProgression extends Progression{
    protected long prev;

    public FibonacciProgression(){
        this(0,1);
    }

    public FibonacciProgression(long first, long second){
        super(first);
        prev = second;
    }

    protected void advance(){
        long temp = prev;
        prev += current;
        current = temp;
    }
}

class TestProgression {
    public static void main(String[] args) {
        Progression prog;

        System.out.print("Arithmetic progression with default increment: \n");
        prog = new ArithmeticProgression();
        prog.printProgression(5);
        System.out.print("Arithmetic progression with increment 5: \n");
        prog = new ArithmeticProgression(5);
        prog.printProgression(5);//(start val, increment value)
        System.out.print("Arithmetic progression with start 2: \n");
        prog = new ArithmeticProgression(3,2);
        prog.printProgression(5);
        System.out.println();

        System.out.print("Geometric progression with default base: \n");
        prog = new GeometricProgression();
        prog.printProgression(10);
        System.out.print("Geometric progression with base 3: \n");
        prog = new GeometricProgression(3);
        prog.printProgression(10);
        System.out.print("Geormetric progression with start 2: \n");
        prog = new GeometricProgression(3,2);
        prog.printProgression(10);
        System.out.println();

        System.out.print("Fibonacci progression with default base: \n");
        prog = new FibonacciProgression();
        prog.printProgression(10);
        System.out.print("Fibonacci progression with first 2 second 3: \n");
        prog = new FibonacciProgression(2,3);
        prog.printProgression(10);
        System.out.print("Fibonacci progression with first 6 second 5: \n");
        prog = new FibonacciProgression(6,8);
        prog.printProgression(10);
    }
}