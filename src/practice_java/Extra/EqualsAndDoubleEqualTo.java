package practice_java.Extra;

public class EqualsAndDoubleEqualTo {

    public static void main(String[] args) {
        String a1 = new String("hello");
        String a2 = new String("hello");
        System.out.println("check");
        System.out.println("using == : " + a1==a2); // something new learned here its works as (System.out.println("using == : " + a1)) == a2
        System.out.println("using == : " + (a1==a2)); // false -> different objects in memory
        System.out.println("using equals() :"+ a1.equals(a2)); // true -> content is same
    }
}
