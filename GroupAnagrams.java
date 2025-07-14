// https://leetcode.com/problems/group-anagrams/

import java.util.ArrayList;
import java.util.List;

class GroupAnagrams {
  public static List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> listAnagrams = new ArrayList<>();
    boolean[] used = new boolean[strs.length];
    for (int i = 0; i < strs.length; i++) {
      List<String> anagrams = new ArrayList<>();
      String str1 = strs[i];
      if (used[i]) continue;
      anagrams.add(str1);
      used[i] = true;
      for (int j = i + 1; j < strs.length; j++) {
        String str2 = strs[j];
        if (str1.length() != str2.length()) continue;
        Boolean isAnagram = true;
        if (used[j]) continue;
        int[] arr = new int[26];
        for (int k = 0; k < str1.length(); k++) {
          arr[str1.charAt(k) - 'a']++;
          arr[str2.charAt(k) - 'a']--;
        }
        for (int num : arr) {
          if (num == 0) continue;
          else {
            isAnagram = !isAnagram;
            break;
          }
        }
        if (isAnagram) {
          anagrams.add(str2);
          used[j] = true;
        }
      }
      listAnagrams.add(anagrams);
    }
    return listAnagrams;
  }

  public static void main(String[] args) {
    String[] strs = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
    List<List<String>> res = groupAnagrams(strs);
    System.out.println(res);
  }
}
