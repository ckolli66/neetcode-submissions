class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i=0;i<piles.length;i++)
        {
           if(piles[i]>max)
           {
            max=piles[i];
           }
        }
        int l=1,r=max;
        int res=max;
        while(l<=r)
        {
            int mid = l+(r-l)/2;
            long totalTime = 0;
            for (int p : piles) {
                totalTime += Math.ceil((double) p / mid);
            }
            if(totalTime<=h)
            {
                res=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return res;
    }
}
