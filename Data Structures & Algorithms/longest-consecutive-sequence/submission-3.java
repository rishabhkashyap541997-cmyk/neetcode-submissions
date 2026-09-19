class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int count=0;
        for(int num : set){
            //if current num is the beginning Num
            if(!set.contains(num-1)){
                int currNum=num;
                int currLength=1;
            
                while(set.contains(currNum+1)){
                    currNum++;
                    currLength++;
                   
                }
                count=Math.max(count,currLength);
            }
        }
        return count;
    }
}
