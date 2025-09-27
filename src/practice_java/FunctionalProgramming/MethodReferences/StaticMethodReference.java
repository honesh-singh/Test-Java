package practice_java.FunctionalProgramming.MethodReferences;

import java.util.function.Function;

public class StaticMethodReference {

    public static int square(int num){
        return num * num;
    }

    public static void main(String[] args) {
        Function<Integer,Integer> fun = n -> square(n);
        System.out.println("by lambda expression -> "+fun.apply(5));


        Function<Integer,Integer> func = StaticMethodReference::square;
        System.out.println("by method reference -> "+func.apply(5));
    }

}
