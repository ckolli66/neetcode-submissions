class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        count_hash = {}
        for i in s:
            count_hash[i]=count_hash.get(i,0)+1
        for k in t:
            if k in count_hash:
                count_hash[k]-=1
            else:
                return False
        for c in count_hash.values():
            if c!=0:
                return False
        return True

        