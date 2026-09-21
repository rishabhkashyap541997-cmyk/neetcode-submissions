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
        
        /*
        int i=0,j=s.length()-1;
        while(i<j){

            //Move i until we get Alphanumeric character
            while(i<j &&
                !((s.charAt(i)>='A' && s.charAt(i)<='Z')||
                (s.charAt(i)>='a' && s.charAt(i)<='z')||
                (s.charAt(i)>='0' && s.charAt(i)<='9'))){
                    i++;
            }

            //Move j until we get Alphanumeric character
            while(i<j &&
                !((s.charAt(j)>='A' && s.charAt(j)<='Z')||
                (s.charAt(j)>='a' && s.charAt(j)<='z')||
                (s.charAt(j)>='0' && s.charAt(j)<='9'))){
                    j--;
            }
            if(Character.toLowerCase(s.charAt(i))!=
            Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;j--;


        }
        return true;
        */

    }
}
