// https://leetcode.com/problems/top-k-frequent-elements/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TopKFrequentElements {

  public static int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(map.entrySet());
    sortedEntries.sort((a, b) -> b.getValue() - a.getValue());

    int[] result = new int[k];
    for (int i = 0; i < k; i++) {
      result[i] = sortedEntries.get(i).getKey();
    }

    return result;
  }

  public static void main(String[] args) {
    int[] nums = new int[] {1, 1, 1, 2, 2, 3};
    int k = 2;
    int[] res = topKFrequent(nums, k);
    System.out.println(Arrays.toString(res));
  }
}
