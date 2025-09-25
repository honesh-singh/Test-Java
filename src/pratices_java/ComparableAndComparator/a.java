package pratices_java.ComparableAndComparator;
//Comparable is used when a class has a natural ordering,
// and you implement it inside the class using compareTo.

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class stud implements Comparable<stud>{

    int rollNO;
    String name;

    public stud(int rollNO, String name){
        this.rollNO=rollNO;
        this.name=name;
    }


    @Override
    public String toString() {
        return "stud{" +
                "rollNO=" + rollNO +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(stud o) {
        return o.rollNO -this.rollNO;
    }
}

public class a {
    public static void main(String[] args) {
        List<stud> ls = Arrays.asList(new stud(23,"harsha"),new stud(2,"vardha"),
                new stud(12,"honesj"));
        System.out.println(ls);
        Collections.sort(ls);
        System.out.println("after sort -> " + ls);

    }

}
