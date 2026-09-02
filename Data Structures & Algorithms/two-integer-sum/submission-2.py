class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        final = {}
        idx=0
        for i in nums:
            if (target-i) in final:
                return [final[target-i],idx]
            final[i]=idx
            idx+=1
        