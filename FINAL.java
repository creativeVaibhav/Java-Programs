public class FINAL extends Animal {
    public void voice(String s1, String s2) {
        System.out.println(s1 + ":" + s2);
    }

    public static void main(String args[]) {
        FINAL f = new FINAL();
        f.voice("hello", "voice");
    }

}