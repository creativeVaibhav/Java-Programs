class Base{
    public int area(int l, int b){
        return l*b;
    }
}

public class Main extends Base{
    public int area(int l, int b){
        if(l==b){
            System.out.println("Area of square is"+ super.area(l, b));
        }
        else{
            System.out.println("Area of square is"+ super.area(l, b));
        }
        return 0;
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.area(2,3);
        m.area(2, 2);
    }
} 

