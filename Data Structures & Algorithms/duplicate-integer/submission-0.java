class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int curr_num = nums[i];
            if (map.containsKey(curr_num)) {
                return true;
            } else {
                map.put(curr_num, i);
            }
        }

        return false;
    }
}