class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        int  count=0; 
        for(String  word : words){
           
           boolean isconsistent = true; 

           for( char ch : word.toCharArray()){

            if(allowed.indexOf(ch)==-1){

                isconsistent= false;
                break;
            }
           }

           if(isconsistent==true){
            count++;
           }
        
        }

        return count;
    }
}