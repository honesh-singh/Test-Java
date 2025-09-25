package pratices_java.ComparableAndComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Word implements Comparable<Word>{
    String word;

    public Word (String word){
this.word=word;
    }
    @Override
    public String toString() {
        return "{" +
                "word='" + word + '\'' +
                '}'+'\n';
    }

    @Override
    public int compareTo(Word o) {
        return  this.word.length() - o.word.length();
    }
}
public class b {
    public static void main(String[] args) {
        List<Word> list = Arrays.asList(new Word("hello"),new Word("erdj"),new Word("sdhjf"), new Word("gd"));
        System.out.println("original list -> \n "+list);
        Collections.sort(list);
        System.out.println("after sorting -> \n "+ list);

    }
}
