class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str.length());
            sb.append("#");
            sb.append(str);   
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i=0;//to point the beginning of the string
        while(i<str.length()){
            int j=i;

            //find delimeter #
            while(str.charAt(j)!='#'){
                j++;
            }

            //Get the characters in string
            int len = Integer.parseInt(str.substring(i,j));

            //Move past #
            j++;
            String substr=str.substring(j,j+len);
            result.add(substr);

            //move i to next encoded string
            i=j+len;
        }
        return result;
    }
}
