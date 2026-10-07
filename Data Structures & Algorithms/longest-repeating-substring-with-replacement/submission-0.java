class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int left=0;
        int highestFreq=0;
        int maxLength=0;
        int[] freq=new int[26];
        for(int right=0;right<n;right++){
            //Add the new element 
            freq[s.charAt(right)-'A']++;
            //find the highest frequency of character(most frequent character)
            highestFreq=Math.max(highestFreq,freq[s.charAt(right)-'A']);
            //find the window size
            int windowSize=right-left+1;
            //find the replacement needed
            int replacementNeeded=windowSize-highestFreq;

            //Check invalid Window
            if(replacementNeeded > k){
                freq[s.charAt(left)-'A']--;
                left++;
            }

            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}
