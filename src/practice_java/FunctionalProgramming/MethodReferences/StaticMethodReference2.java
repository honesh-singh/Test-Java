package practice_java.FunctionalProgramming.MethodReferences;

import java.util.Arrays;
import java.util.List;
// if your lambda just calling an existing method, replace it with
// method reference
public class StaticMethodReference2 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("harsha","naman","vardhan");
        System.out.println("by lambda ->");
        list.forEach(name -> System.out.println(name));// warning here : Lambda can be replaced with method reference (hosiyaar hai system)
        System.out.println("by method ref ->");
        list.forEach(System.out::println);

    }
}
