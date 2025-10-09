class Solution {
    public String reverseWords(String s) {

         StringBuilder result = new StringBuilder();

        String[] str = s.split(" ");

        for(String word : str){

            StringBuilder reverseWord = new StringBuilder(word);
            reverseWord.reverse();

            result.append(reverseWord).append(" ");

        }

        return result.toString().trim();
        
    }
}