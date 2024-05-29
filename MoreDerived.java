public class MoreDerived extends Derived{
    public void voice(){
        System.out.println("speak");
    }
    public void display(){
        System.out.println("faltu");
    }
    /*public MoreDerived(){
        super();
        System.out.println("hello");
    }*/
    
    public static void main(String[] args){
        MoreDerived f = new MoreDerived();
        f.voice();
        f.display();
        f.run();
    }
    
}