package practice_java.CollectionFramework.list.arraylist;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Iterator;

public class a{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(34);
        list.add(45);

        int [] arr= {1,2,3,4,5};
        for(int num : arr){
            list.add(num);
        }
        list.add(6,33333);
        list.set(5,332);
        list.remove(5);
        System.out.println(list.set(6,2222));
        System.out.println(list.get(6));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(2));
        System.out.println(list.indexOf(2));
        System.out.println(list.lastIndexOf(2));
        System.out.println(list);


        Iterator<Integer> lit = list.iterator();
        while(lit.hasNext()){
            System.out.print(lit.next() +" ");
        }
        ListIterator<Integer> lit1=list.listIterator(list.size());
        System.out.println("backword");
        while (lit1.hasPrevious()) {
            System.out.print(lit1.previous());
        }
        list.clear();
        System.out.println(list);
    }
}
