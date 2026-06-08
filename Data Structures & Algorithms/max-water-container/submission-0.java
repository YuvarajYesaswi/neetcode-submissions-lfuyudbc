class Solution {
    public int maxArea(int[] heights) {
        int maxarea = 0;
        int l=0;
        int r=heights.length-1;
        while(l<r){
            int h=Math.min(heights[l],heights[r]);
            int w =r-l;
            int area = h*w;
            maxarea = Math.max(area,maxarea);
            if(heights[l]<=heights[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }
}
