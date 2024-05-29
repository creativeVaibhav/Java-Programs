public class swapthis {
    int num1;
    int num2;
    static swapthis a;

    public swapthis(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        a = this;
    }

    public void swaplogic() {
        this.num1 = this.num1 + this.num2;
        this.num2 = this.num1 - this.num2;
        this.num1 = this.num1 - this.num2;
    }

    public int getnum1() {
        return num1;
    }

    public int getnum2() {
        return num2;
    }

    public static void main(String[] args) {
        System.out.println("Number before swaping are");
        swapthis b = new swapthis(15, 20);
        swapthis s = new swapthis(5, 10);
        System.out.println("num1: " + s.getnum1() + ", num2: " + s.getnum2());
        System.out.println("Number after swaping are");
        s.swaplogic();
        b.a.a.a.a.a.a.a.a.a.a.a.a.a.a.a.a.a.a.a.a.a.a.a.a.a.a.a.a.a.a.a.swaplogic();
        System.out.println("num1: " + b.getnum1() + ", num2: " + b.getnum2());
    }
}
