class Solution {
    public int myAtoi(String str) {
       
       if(str==null && str.isEmpty()) return  0;

        str=str.trim();
        
        if(str.isEmpty()){
            return 0;
        }

        int index=0;
        int sign =1;
        int n= str.length();
        long num =0;

       


        if(str.charAt(index)=='-' || str.charAt(index)=='+'){

            sign = (str.charAt(index)=='-') ? -1 : 1;
            index++;
        }

        
         while(index < n &&  Character.isDigit(str.charAt(index))){

             num = num*10+(str.charAt(index)-'0');

             if(num * sign> Integer.MAX_VALUE){
                 return  Integer.MAX_VALUE;
             }

             if(num * sign < Integer.MIN_VALUE){
                 return  Integer.MIN_VALUE;
             }

             index++;
         }

         return  (int)(sign * num);
        
    }
}