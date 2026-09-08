class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        //Brute Force :TC-> O(nlogn) ; SC-> O(n)
        /*
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){//O(n)
            map.put(num,map.getOrDefault(num,0)+1);//O(1)
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());//O(nlogn)
        int[] result=new int[k];
        for(int i=0;i<k;i++){//O(k)
            result[i]=list.get(i).getKey();
        }
        return result;
        */
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        //create buckets
        List<Integer> []buckets=new List[nums.length+1];
        for(int num : map.keySet()){
            int frequency = map.get(num);

            if(buckets[frequency]==null){
                buckets[frequency]=new ArrayList<>();
            }
            buckets[frequency].add(num);//if same frequency is present for other num
        }

        int[] result=new int[k];
        int count=0;
        for(int i=buckets.length-1;i>=0;i--){
            if(count==k){
                return result;
            }
           if(buckets[i]!=null){
            for(int num : buckets[i]){
                result[count]=num;
                count++;
            }
           }

        }
        return result;


    }
}
