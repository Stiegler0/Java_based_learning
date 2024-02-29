import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 {
    public static void main(String[] args){
        HashSet<Integer> liste1 = new HashSet<>();
        int[] nums1 = {1,2,3,4,4};
        for(int a : nums1) liste1.add(a);

        Iterator<Integer> iter = liste1.iterator();
        while(iter.hasNext()){
            int num = iter.next();
            System.out.println(num);
        }
        System.out.println("------------------");

        int[] nums2 = {1,80,4};
        HashSet<Integer> liste2 = new HashSet<>();
        for(int a : nums2) liste2.add(a);
        Iterator<Integer> iter2 = liste2.iterator();
        while(iter2.hasNext()){
            int num = iter2.next();
            System.out.println(num);
        }
        // create a copty of a hashset
        System.out.println("------------------");
        System.out.println(liste2.equals(liste1));
        // create a copty of a hashset
        HashSet<Integer> copy1 = new HashSet<>(liste1);
        copy1.retainAll(liste2);
        System.out.println(copy1);

    }

    @Override
    public boolean equals(Object o){
        return true;
    }

}
