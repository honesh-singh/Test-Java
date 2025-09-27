package practice_java.FunctionalProgramming.InterfacesAndAnonymousClasses;
interface Hello{
    void hello();
}
public class anonymousDemo {
    public static void main(String[] args) {
        Hello hel = new Hello() {
            @Override
            public void hello() {
                System.out.println("Hello from anonymous class");
            }
        };
        hel.hello();
        System.out.println(hel.getClass());
        // output something like this ->
        // class pratices_java.FunctionalProgramming.InterfacesAndAnonymousClasses.anonymousDemo$1
        // $1 means this is the first anonymous class inside anonymousDemo

        Hello hel2 = new Hello() {
            @Override
            public void hello() {
                System.out.println("just testing");
            }
        };
        System.out.println(hel2.getClass());
        // class pratices_java.FunctionalProgramming.InterfacesAndAnonymousClasses.anonymousDemo$2
        // $2 here because it's second anonymous class

    }
}
