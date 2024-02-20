// https://leetcode.com/problems/two-sum/
class Solution {
  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    for (int i=0; i<nums.length; i++) {
      Integer valueToSearch = target - nums[i];
      Integer possibleIndexMatch = hashMap.get(valueToSearch);
      if (possibleIndexMatch != null) {
        return new int[] {i, possibleIndexMatch};
      }
      hashMap.put(nums[i], i);
    }
    return new int[] {};
  }
}
