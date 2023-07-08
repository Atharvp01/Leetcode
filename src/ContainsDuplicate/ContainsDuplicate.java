package src.ContainsDuplicate;
import java.util.*;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] arr = {1,1,1,3,3,4,3,2,4,2};
        boolean res = containsDuplicate(arr);
        System.out.println(res);
    }

    public static boolean containsDuplicate(int[] arr) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int key : arr){
            if(map.containsKey(key)){
                return true;
            }
            map.put(key, false);
        }
        return false;
    }

}
