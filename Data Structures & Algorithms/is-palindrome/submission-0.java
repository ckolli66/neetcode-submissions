class Solution {
    public boolean isPalindrome(String s) {
        String regex="[^a-zA-Z0-9]";
        String temp= s.replaceAll(regex, "");
        String temp2= temp.toLowerCase();
        int left=0,right=temp2.length()-1;
        while(left<right)
        {
            if(temp2.charAt(left)!=temp2.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
