class Solution {
    public int[] productExceptSelf(int[] nums) {
        /*Approach 1 :
        int[] result=new int[nums.length];
        int[] prefix=new int[nums.length];
        Arrays.fill(prefix,1);
        int[] suffix=new int[nums.length];
        Arrays.fill(suffix,1);
        for(int i=1;i<nums.length;i++){
           prefix[i]=prefix[i-1]*nums[i-1];   
        }
        for(int i=nums.length-2;i>=0;i--){
            suffix[i]=suffix[i+1]*nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            result[i]=prefix[i]*suffix[i];
        }
        return result;
        */
        int[] result=new int[nums.length];
        int left=1;
        for(int i=0;i<nums.length;i++){
            result[i]=left;
            left*=nums[i];
        }

        int right=1;
        for(int i=nums.length-1;i>=0;i--){
            result[i]*=right;
            right*=nums[i];
        }
        return result;

    }
}  
