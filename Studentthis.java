public class Studentthis {
    int rollno;
    String name;
    int age;
    String Department;

    public Studentthis(int rollno, String name, int age, String Department) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.Department = Department;
        this.display();
    }

    public void display() {
        System.err.println(rollno);
        System.err.println(name);
        System.err.println(age);
        System.err.println(Department);
    }

    public static void main(String[] args) {
        Studentthis s1 = new Studentthis(1, "Vaibhav", 18, "cse");
        Studentthis s2 = new Studentthis(2, "golu", 18, "ece");
    }
}
