package practice_java.Extra;

interface Hello{
    void hello();
}

public class ThisInsideAnonymousClass {
    int x =100;
    void test(){
        Hello h = new Hello() {
            int x=50;
            @Override
            public void hello() {
                System.out.println(x); // inner x -> refer to anonymous class (50)
                System.out.println(this.x); // inner x ->  refer to anonymous class (50)
                System.out.println(ThisInsideAnonymousClass.this.x); // outer x -> refers to outer class (100)
            }
        };
        h.hello();
    }

    public static void main(String[] args) {
       new ThisInsideAnonymousClass().test();
    }
}
