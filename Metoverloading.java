class a {
    public static void area(int a, int b){
        System.out.println(a*b);
    }

    public static void area(int a){
        System.out.println(a*a);
    }
}

public class Metoverloading {
    public static void main(String args[]) {
        a.area(2);
    }
}
