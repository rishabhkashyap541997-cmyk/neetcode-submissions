class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int start=0;start<s.length();start++){
            if((s.charAt(start)>='A' && s.charAt(start)<='Z')||
            (s.charAt(start)>='a' && s.charAt(start)<='z')||
            (s.charAt(start)>='0' && s.charAt(start)<='9')){
                sb.append(s.charAt(start));
            }
        }
        String lowerStr=sb.toString().toLowerCase();
        int i=0,j=sb.length()-1;
        while(i<j){
            if(lowerStr.charAt(i)==lowerStr.charAt(j)){
                i++;j--;
            }
            else{
                return false; 
            }
        }
        return true;
    }
}
