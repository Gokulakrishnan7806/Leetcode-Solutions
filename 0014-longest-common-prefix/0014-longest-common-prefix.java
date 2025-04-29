class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) return "";

        String Prefix=strs[0];

        for(int i=1;i<strs.length;i++){


            while(strs[i].indexOf(Prefix)!=0){

             Prefix = Prefix.substring(0, Prefix.length() - 1);
                if(Prefix.isEmpty()){
                    return "";
                }
            }
        }
        return Prefix;
        
    }
}