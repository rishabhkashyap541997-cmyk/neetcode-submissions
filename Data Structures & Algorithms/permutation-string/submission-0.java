class Solution {
    public boolean checkInclusion(String s1, String s2) {
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
    }
}
