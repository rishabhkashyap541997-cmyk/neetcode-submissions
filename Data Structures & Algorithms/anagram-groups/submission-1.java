class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        //Brute Force TC-> O(N^2*K)
        //SC -> O(N)
        /*
        List<List<String>> result = new ArrayList<>();

        for (String str : strs) {

            boolean added = false;

            for (List<String> group : result) {

                if (isAnagram(str, group.get(0))) {

                    group.add(str);
                    added = true;
                    //group is already a part of result 
                    //adding element in group automatically adds it in result
                    break;
                }
            }

            if (!added) {

                List<String> newGroup = new ArrayList<>();

                newGroup.add(str);

                result.add(newGroup);
            }
        }

        return result;
    }


    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {

            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int count : freq) {

            if (count != 0) {
                return false;
            }
        }

        return true;
        */

        
        //Better Approach
        //TC=O(N*KlogK); SC=O(N*K)
        /*
        Map<String,List<String>> map=new HashMap<>();
        for(String str : strs){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);

        }
        
        // List<List<String>> res=new ArrayList<>();
        // for(List<String> grp : map.values()){
        //     res.add(grp);
        // }
        // return res;
        return new ArrayList<>(map.values());
        */

        //Optimal approach
        Map<String,List<String>> map=new HashMap<>();
        for(String str : strs){
            int[] freq=new int[26];
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                freq[ch-'a']++;
            }
            StringBuilder key = new StringBuilder();
            for(int i=0;i<26;i++){
                key.append(freq[i]).append('#');

            }
            if(!map.containsKey(key.toString())){
                map.put(key.toString(),new ArrayList<>());
            }
            map.get(key.toString()).add(str);
        }

        return new ArrayList<>(map.values());

    }
}
