class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Map<Integer,Integer> map=new HashMap<>();
        int key=-1;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.getOrDefault(map.get(nums[i])+1,1));
                key=nums[i];

            }
            map.put(nums[i],1);

        }
        if(key==-1)
        return false;

        return true;
        
    }
}