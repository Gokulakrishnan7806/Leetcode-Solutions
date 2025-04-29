class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder builder=new StringBuilder();
          int i=0;
             int j=0;

       

        while(i<word1.length() && j<word2.length()){

           

            builder.append(word1.charAt(i++));
            builder.append(word2.charAt(j++));


        }

        while(i<word1.length()){
            builder.append(word1.charAt(i++));
            
        }

        
        while(j<word2.length()){
            builder.append(word2.charAt(j++));
            
        }

        return builder.toString();

        
    }
}