package pratices_java.ComparableAndComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
         List<Integer> list = Arrays.asList(5,6,534,5,34,534,5);
        Comparator<Integer> com = (a,b)-> b-a;

        System.out.println("original list -> "+list);
        Collections.sort(list);
        System.out.println("after sort -> "+list);
        Collections.sort(list,com);
        System.out.println("sort using comparator -> "+list);


    }
}