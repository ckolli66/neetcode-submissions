class Solution {
    public int[] twoSum(int[] nums, int target) {
        int c=0,d=0;
        int j = nums.length-1;
        while(j>0)
        {
            for(int i=0;i<nums.length;i++)
            {
                if(i<j)
                {
                if(nums[i]+nums[j]==target)
                {
                    c=i;
                    d=j;
                }
                }
            }
            j--;
        }
        int k[]={c,d};
        return k;
    }
}
