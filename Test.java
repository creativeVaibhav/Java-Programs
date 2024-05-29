/*public class UseofThis {
    String name;

    public UseofThis() {
        this("ramu");
    }

    public UseofThis(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        UseofThis n1 = new UseofThis();
        n1.display();
    }
}*/

/*public class UseofThis {
    void m(UseofThis obj) {
        System.out.println(obj);
    }

    void p() {
        m(this);
        System.out.println(this);
    }

    public static void main(String[] args) {
        UseofThis s1 = new UseofThis();
        s1.p();
    }
}*/

/*class A {
    A getA() {
        return this;
    }

    void msg() {
        System.out.println("Hello Java");
    }
}
public class Test {
    public static void main(String[] args) {
        new A().getA().msg();
    }
}*/

class UseofThis {
    void m() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        UseofThis obj = new UseofThis();
        obj.m();
        System.out.println(obj);
    }
}
