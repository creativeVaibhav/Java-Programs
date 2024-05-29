/*public class UseofStatic {
    static String name;
    int rollno;

    UseofStatic(int rollno) {
        this.rollno = rollno;
    }

    void display() {
        System.out.println(name);
        System.out.println(rollno);
    }

    void set(String a) {
        name = a;
    }

    public static void main(String[] args) {
        UseofStatic a = new UseofStatic(1);
        UseofStatic b = new UseofStatic(2);
        UseofStatic c = new UseofStatic(3);

        a.set("pog");
        c.display();
    }
}*/

public class UseofStatic {
    static int a = 10;

    public void display() {
        System.out.println(++a);
    }

    public static void main(String[] args) {
        new UseofStatic().display();
        new UseofStatic().display();
        new UseofStatic().display();
        new UseofStatic().display();
        new UseofStatic().display();
    }
}
