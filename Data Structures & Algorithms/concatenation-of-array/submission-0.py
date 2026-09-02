class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        ans = [0] * (2*len(nums))
        for num in range(0,2*len(nums)):
            ans[num]=nums[num%len(nums)]
        return ans
        