class Foo{
    void print() {
        System.out.println("1");
    }
    void print(Object obj) {
        System.out.println("2");
    }
    void print(String str) {
        System.out.println("3");
    }
}

public class ex1 {
    public static void main(String[] args) {
        Foo foo=new Foo();
        Object x = null;
        foo.print();
        foo.print(x);
        foo.print(0);
        foo.print(48);
        foo.print(true);
        foo.print('\0');
        foo.print(null);
    }
}