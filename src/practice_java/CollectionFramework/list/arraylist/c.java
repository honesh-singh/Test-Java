package practice_java.CollectionFramework.list.arraylist;

// Basic Operations
// Create an ArrayList<Integer> and perform the following:

// Add 5 numbers

// Remove the 3rd element

// Update the 2nd element to a new number

// Print the list after each operation
import java.util.ArrayList;
public class c{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.remove(3);
        list.set(2,33);
        System.out.println(list);
    }
}
