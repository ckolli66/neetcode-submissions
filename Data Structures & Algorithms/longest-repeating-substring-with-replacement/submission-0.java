class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> freq = new HashMap<>();
        int left = 0, right = 0, max = 0, maxFreq = 0;
        
        while (right < s.length()) {
            char ch = s.charAt(right);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            maxFreq = Math.max(maxFreq, freq.get(ch)); // Track max frequency
            
            // Check if replacements exceed `k`
            while ((right - left + 1) - maxFreq > k) {
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                left++;
            }
            
            // Calculate the max window size
            max = Math.max(max, right - left + 1);
            right++;
        }
        
        return max;
    }
}
