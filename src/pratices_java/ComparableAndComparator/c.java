package pratices_java.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Version implements Comparable<Version>{
     String version;

     Version(String version){
         this.version=version;
     }

    @Override
    public String toString() {
        return version;
    }

    @Override
    public int compareTo(Version o) {
         // Sting -> Sting array ==> "1.2.0.0" -> ["1","2","0","0"]
        String[] thisVer = this.version.split("\\.");
        String[] oVer = o.version.split("\\.");

        // which version has more parts or elements , considered as length
        int verLength = Math.max(thisVer.length, oVer.length);

        for(int i = 0;i<verLength;i++){

            int thisN = i < thisVer.length ? Integer.parseInt(thisVer[i]):0;
            int oN = i < oVer.length ? Integer.parseInt(oVer[i]):0;

            if(thisN != oN){
                return thisN - oN;
            }
        }
        return 0;
    }
}
public class c {
    public static void main(String[] args) {
        List<Version> list = new ArrayList<>();
        list.add(new Version("1.3.5.6"));
        list.add(new Version("1.1"));
        list.add(new Version("1.2.5.6"));
        list.add(new Version("1.3.2.6"));


        System.out.println("Original list -> "+list);
        Collections.sort(list);
        System.out.println("after sort -> " +list);
    }

}
