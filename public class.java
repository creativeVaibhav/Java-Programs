public class TestThrows {
    public void validateAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("You are not eligible");
        } else {
            System.err.println("ok");
        }
    }

    public static void main(String[] args) {
        TestThrows t = new TestThrows();
        t.validateAge(20);
        System.err.println("Rest of the code");
    }
}