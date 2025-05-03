class Solution {
    public int firstUniqChar(String s) {
        

        for(int i=0;i<s.length();i++){

            boolean unique=true;;

            char ch=s.charAt(i);

            for(int j=0;j<s.length();j++){

                if(i!=j && ch==s.charAt(j)){

                    unique=false;
                    break;
                   
                }
            }
            if(unique==true){

                return i;
            }


        }
        return -1;
        
    }
}