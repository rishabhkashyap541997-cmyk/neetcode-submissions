class Solution {
    public int lengthOfLongestSubstring(String s) {
        /* BruteForce :
        //TC = O(n^4)
        //SC = O(1)
        int n=s.length();
        int maxLength=1;
        for(int i=0;i<n;i++){
            //for substrings
            for(int j=i;j<n;j++){
                boolean isUnique=true;
                //for dups in substrings from i to j
                for(int k=i;k<=j;k++){
                    for(int l=k+1;l<=j;l++){
                        if(s.charAt(k) == s.charAt(l)){
                            isUnique=false;
                            break;
                        }
                    }
                    if(!isUnique){
                        break;
                    }

                }
                if(isUnique){
                    maxLength=Math.max(maxLength,j-i+1);
                }
                
            }
            
        }
        return maxLength;
        */
        int n=s.length();
        Set<Character> set=new HashSet<>();
        int left=0;
        int maxLength=0;
        for(int right=0; right<n; right++){
            
            
            //check for invlid window
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            //include the new element
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
            }

            //Update answer using valid window;
            maxLength=Math.max(maxLength,right-left+1);

        }
        return maxLength;
    }
}
