class Solution {
    public int longestValidParentheses(String str) {
         Stack<Integer> stack = new Stack<>();
           int maxlength=0;

           stack.push(-1);

        if(str.length() == 0){
            return 0;
        }

        for(int i=0;i<str.length();i++){

            if(str.charAt(i)=='('){
                stack.push(i);
            }

            else{
                 stack.pop();

                 if(stack.isEmpty()){

                    stack.push(i);
                 }
                 else{

                    maxlength=Math.max(maxlength,i-stack.peek());
                 }

            }
        }

       return maxlength;
    }
}