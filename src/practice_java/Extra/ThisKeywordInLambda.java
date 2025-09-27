package practice_java.Extra;


@FunctionalInterface
interface Lm<T>{
    void check(T x);
        }

public class ThisKeywordInLambda {

    String x ="by Class field";

    void run() {
//        Inside a lambda, this always refers to the enclosing class instance, not the lambda
        Lm<String> l = x -> System.out.println(" x : "+this.x +"  x : " +x);
        l.check("by lambda parameter");
    }

    public static void main(String[] args) {
        new ThisKeywordInLambda().run();

    }

}
