class Solution {
    public String removeOuterParentheses(String str) {

        StringBuilder sb =  new StringBuilder();
        int count=0;

        for(int i=0;i<str.length();i++){

            if(str.charAt(i)==')'){
                count--;
            }

            if( count != 0){
                sb.append(str.charAt(i));
            }

            if(str.charAt(i)=='('){
                count++;
            }
        }

        return sb.toString();
        
    }
}