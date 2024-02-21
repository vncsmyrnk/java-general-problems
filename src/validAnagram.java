// https://leetcode.com/problems/valid-anagram/
class Solution {
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    HashMap<Character, Integer> charMap = new HashMap<>();
    for (Character cOnS : s.toCharArray()) {
      int existingValue = charMap.getOrDefault(cOnS, 0);
      charMap.put(cOnS, ++existingValue);
    }

    for (Character cOnT : t.toCharArray()) {
      int existingValue = charMap.getOrDefault(cOnT, 1);
      charMap.put(cOnT, --existingValue);
    }

    for (Integer valueOnMap : charMap.values()) {
      if (valueOnMap != 0) {
        return false;
      }
    }
    return true;
  }
}
