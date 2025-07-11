// https://leetcode.com/problems/contains-duplicate/

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

  public static boolean containsDuplicate(int[] nums) {
    Set<Integer> numbers = new HashSet<>();
    for (int num : nums) {
      if (!numbers.add(num)) return true;
      numbers.add(num);
    }

    return false;
  }

  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 1};
    boolean res = containsDuplicate(nums);
    System.out.println(res);
  }
}
