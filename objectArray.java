public class objectArray {
    public static void main(String[] args) {
        Techer techers[] = new Techer[3];
        techers[0] = new Techer("Deshan", 23);
        techers[1] = new Techer("Harshana", 22);
        techers[2] = new Techer("Nawarathna", 20);
        for (Techer t : techers) {
            System.out.println(t);
        }
    }
}

class Techer {
    String name = "";
    int age = 0;

    Techer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " " + age;
    }
}