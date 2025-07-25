// https://leetcode.com/problems/group-anagrams/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GroupAnagrams {
  public static List<List<String>> groupAnagrams(String[] strs) {

    Map<String, List<String>> map = new HashMap<>();

    for (String str : strs) {
      char[] charArray = str.toCharArray();
      Arrays.sort(charArray);
      String sortedStr = new String(charArray);

      if (!map.containsKey(sortedStr)) {
        map.put(sortedStr, new ArrayList<>());
      }
      map.get(sortedStr).add(str);
    }

    return new ArrayList<>(map.values());
  }

  public static void main(String[] args) {
    String[] strs = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
    List<List<String>> res = groupAnagrams(strs);
    System.out.println(res);
  }
}
