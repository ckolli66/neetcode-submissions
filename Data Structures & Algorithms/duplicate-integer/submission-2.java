class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> a = new ArrayList<Integer>();

        for(int i=0;i<nums.length;i++)
        {
            if(a.contains(nums[i]))
            {
                return true;
            }
            a.add(nums[i]);
        }
        return false;
    }
}
