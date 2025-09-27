package practice_java.CollectionFramework.list.arraylist;
// Reverse an ArrayList
// Write a program to reverse an ArrayList<Integer> without using Collections.reverse()
import java.util.ArrayList;
public class d {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original order :"+list);

        for(int i=0;i<list.size()/2;i++ ){
            Integer temp =list.get(list.size()-1-i);
            list.set(list.size()-i-1,list.get(i));
            list.set(i,temp);
        }

        System.out.println("revered list :"+list);
    }
}
