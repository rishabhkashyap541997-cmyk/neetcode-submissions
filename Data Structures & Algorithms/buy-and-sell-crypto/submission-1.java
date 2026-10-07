class Solution {
    public int maxProfit(int[] prices) {
        /*Brute force 
        //Tc= O(n^2)
        //Sc=O(1)
        int n=prices.length;
        int MaxProfit=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(prices[j]>prices[i]){
                    MaxProfit=Math.max(MaxProfit,prices[j]-prices[i]);
                }
            }
        }
        return MaxProfit;
        */

        //Optimal Solution
        //TC=O(n)
        //SC=O(1)
        int minProfit=prices[0];
        int profit=0;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            minProfit=Math.min(minProfit,prices[i]);
            profit=prices[i]-minProfit;
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}
