class Demo {
    public int a = 10;
    private int b = 20;
    int c = 30;          // default
    protected int d = 40;

    void display() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class AccessModifierDemo {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.display();
    }
}
