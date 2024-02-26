import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 {
    public static void main(String[] args){
        HashSet<Integer> liste1 = new HashSet<>();
        int[] nums1 = {1,2,3,4};
        for(int a : nums1) liste1.add(a);

        Iterator<Integer> iter = liste1.iterator();
        while(iter.hasNext()){
            int num = iter.next();
            System.out.println(num);
        }
    }
}
