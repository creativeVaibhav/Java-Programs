import java.io.*;

public class TestThrows {
    /*
     * public void validateAge(int age) throws IOException {
     * if (age < 18) {
     * throw new IOException("You are not eligible");
     * } else {
     * System.err.println("ok");
     * }
     * }
     * 
     * public static void main(String[] args) {
     * TestThrows t = new TestThrows();
     * try {
     * t.validateAge(45);
     * } catch (Exception e) {
     * System.out.println(e);
     * }
     * System.err.println("Rest of the code");
     * }
     */
    public int fun(int m, int n) {
        int c = m / n;
        return c;
    }

    public static void main(String[] args) {
        TestThrows t = new TestThrows();
        try {
            System.err.println(t.fun(10, 00));
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.err.println("Number can't be divided by zero");
        }
        System.err.println("rest of code");
    }
}