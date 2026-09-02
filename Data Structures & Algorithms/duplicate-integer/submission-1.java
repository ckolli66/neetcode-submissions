class Solution {
    public boolean hasDuplicate(int[] nums) {
        int left = 0;
        boolean h=false;
        while(left<nums.length-1) {
            for (int i = 1; i < nums.length; i++) {
                if (left < i) {
                    if (nums[left] == nums[i]) {
                        h = true;
                        break;
                    }
                }
            }
            left++;
        }
        return h;
    }
}
