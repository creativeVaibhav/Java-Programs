class Parent {
    public Parent() {
        System.out.println("constructor");
    }
}

public class Constructor extends Parent {
    String name;
    int age;
    String dept;

    public Constructor(String name, int age, String dept) {
        this(dept);
        this.name = name;
        this.age = age;
    }

    public Constructor(String dept) {
        this.dept = dept;
    }

    public void displayinfo() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(dept);
    }

    public static void main(String[] args) {
        Constructor m = new Constructor("Vaibhav", 20, "CSE");
        m.displayinfo();
    }
}
