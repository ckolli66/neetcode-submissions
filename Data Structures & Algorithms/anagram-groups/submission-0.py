class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        count_char= defaultdict(list)

        for s in strs:
            count = [0] * 26
            for c in s:
                count[ord(c)-ord('a')] += 1
            count_char[tuple(count)].append(s)
        return list(count_char.values())