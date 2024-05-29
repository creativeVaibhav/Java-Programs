abstract class Sample {
    public Sample() {
        System.out.println("Hello");
    }

    public void display() {
        System.out.println("Hello Abstraction");
    }
}

public class AbstractSample extends Sample {
    public void tvOn() {
        System.out.println("ON");
    }

    public static void main(String[] args) {
        AbstractSample a = new AbstractSample();
        a.display();
        a.tvOn();
    }
}
