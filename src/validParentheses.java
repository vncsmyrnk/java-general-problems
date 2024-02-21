// https://leetcode.com/problems/valid-parentheses/
class Solution {
  public boolean isValid(String s) {
    if (s.length() % 2 != 0) {
      return false;
    }

    Stack<Character> chars = new Stack<>();
    for (int i=0; i<s.length(); i++) {
      Character c = s.charAt(i);
      if (c == '(') {
        chars.push(')');
      } else if (c == '[') {
        chars.push(']');
      } else if (c == '{') {
        chars.push('}');
      } else if (chars.isEmpty() || chars.pop() != c) {
        return false;
      }
    }

    return chars.isEmpty();
  }
}
