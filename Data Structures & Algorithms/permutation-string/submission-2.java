class Solution {
    public boolean checkInclusion(String s1, String s2) {
        /*BruteForce : TC=max(nlogn,klogk); sc=O(n)
       char[] charArrays1=s1.toCharArray();
       Arrays.sort(charArrays1);

       for(int i=0;i<=s2.length()-s1.length();i++){
        String currentSub=s2.substring(i,i+s1.length());
        char[] charArray2=currentSub.toCharArray();
        Arrays.sort(charArray2);
        if(Arrays.equals(charArrays1,charArray2)){
            return true;
        }
       }
       return false;
       */

       //Optimal Soln : TC = O(n); SC=O(n)
       if(s1.length()>s2.length()){
        return false;
       }
       int left=0;
       int[] s1Arr=new int[26];
       int[] s2Arr=new int[26];

       for(char ch : s1.toCharArray()){
        s1Arr[ch-'a']++;
       }


       for(int right=0;right<s2.length();right++){
        s2Arr[s2.charAt(right)-'a']++;

        if(right-left+1>s1.length()){
            s2Arr[s2.charAt(left)-'a']--;
            left++;
        }

        if(Arrays.equals(s1Arr,s2Arr)){
            return true;
        }

       }
       return false;

    }
}
