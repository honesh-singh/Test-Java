package practice_java.CollectionFramework.list.arraylist;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class cam implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }

}
public class b {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,5,754,25,856,7456,23,6,3,3);
        System.out.println(list);
        list.sort(new cam());

        System.out.println(list);

        list.sort((a,b)->b-a);
        System.out.println(list);
    }
}
