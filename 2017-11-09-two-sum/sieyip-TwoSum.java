
class Solution {
    public int[] twoSum(int[] nums, int target) {
            int[] solution = new int[2];
            HashMap<Integer, Integer> valMap = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                        if (valMap.containsKey(nums[i])) {
                                        solution[0] = valMap.get(nums[i]);
                                        solution[1] = i;
                                    } else {
                                                    int remainder = target - nums[i];
                                                    valMap.put(remainder, i);
                                                }
                    }
            return solution;
        }
}
