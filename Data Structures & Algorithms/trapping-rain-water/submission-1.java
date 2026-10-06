class Solution {
    public int trap(int[] height) {
        /*
        Brute Force = TC : O(n^2); SC : O(1)
        int TotalWater=0;
        int n=height.length;
        int water=0;
        for(int i=0;i<n;i++){
            int leftMax=0;
            int rightMax=0;

            //find tallest building to the left of current bar
            for(int j=0;j<=i;j++){
                leftMax=Math.max(leftMax,height[j]);
            }

            //find tallest building to the left of current bar
            for(int k=i;k<n;k++){
                rightMax=Math.max(rightMax,height[k]);
            }
            water=Math.min(leftMax,rightMax)-height[i];
            TotalWater+=water;

        }
        return TotalWater;
        */

        //Optimal Solution
        //TC : O(n) ; SC = O(1)
        int n = height.length;
        int left=0;
        int right=n-1;
        int leftMax=0;
        int rightMax=0;
        int totalWater=0;
        while(left < right){
            if(leftMax < height[left]){
                leftMax=Math.max(leftMax,height[left]);
            }

            if(rightMax < height[right]){
                rightMax=Math.max(rightMax,height[right]);
            }

            if(leftMax<rightMax){
                totalWater+=leftMax-height[left];
                left++;
            }
            else{
                totalWater+=rightMax-height[right];
                right--;
            }

        }
        return totalWater;

    }
}
