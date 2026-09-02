class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top=0;
        int bottom=matrix.length-1;

        int COL=matrix[0].length;

        while(top<=bottom)
        {
            int mid = top+(bottom-top)/2;
            if(matrix[mid][0]>target)
            {
                bottom=mid-1;
            }
            else if(matrix[mid][COL-1]<target)
            {
                top=mid+1;
            }
            else
            {
                break;
            }
        }
        if(!(top<=bottom))
        {
            return false;
        }
        int mid=top+(bottom-top)/2;
        int l=0,r=matrix[0].length-1;
        while(l<=r)
        {
            int m=l+(r-l)/2;
            if(target<matrix[mid][m])
            {
                r=m-1;
            }else if(target>matrix[mid][m])
            {
                l=m+1;
            }else
            {
                return true;
            }
        }
        return false;
    }
}
