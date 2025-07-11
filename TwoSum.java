// https://leetcode.com/problems/two-sum/description/
//
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

  public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int j = 0; j < nums.length; j++) {
      if (map.containsKey(target - nums[j])) return new int[] {j, map.get(target - nums[j])};
      map.put(nums[j], j);
    }

    return new int[] {};
  }

  public static void main(String[] args) {
    int[] nums = {3, 2, 4};
    int target = 6;
    int[] res = twoSum(nums, target);
    System.out.println(Arrays.toString(res));
  }
}
