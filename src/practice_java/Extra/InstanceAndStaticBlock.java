package practice_java.Extra;

class a1{
    {  // when constructor is invoked instance block run first   instance block -> constructor
        System.out.println("instance block of a1..");
    }
    static {
        System.out.println("static block of a2.....");
    }
}

public class InstanceAndStaticBlock {
   // static block runs first → when the class a is loaded into JVM (only once)
    static{
        System.out.println("this is static block of a ......");
    }

    InstanceAndStaticBlock(){
        System.out.println("a's constructor here.......");
    }
    {
        System.out.println(" this is instance block a ........");
    }
    public static void main(String[] args) {
        System.out.println("main method......");
         new a1();
        new InstanceAndStaticBlock();
        new a1();

        new InstanceAndStaticBlock();
    }

}
