// https://leetcode.com/problems/valid-anagram/description/

public class ValidAnagram {

  public static boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;
    int[] arr = new int[26];
    for (int i = 0; i < s.length(); i++) {
      arr[s.charAt(i) - 'a']++;
      arr[t.charAt(i) - 'a']--;
    }

    for (int num : arr) {
      if (num != 0) return false;
    }

    return true;
  }

  public static void main(String[] args) {
    String s = "anagram";
    String t = "anagram";
    boolean res = isAnagram(s, t);
    System.out.println(res);
  }
}
