class Solution {
    public String addStrings(String num1, String num2) {


        StringBuilder sb=new StringBuilder();

        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;

        while(i>=0 || j>=0 || carry==1){

            int digits1=(i>=0) ? num1.charAt(i--) -'0' : 0;
            int digits2=(j>=0) ? num2.charAt(j--) - '0':0;


            int sum=digits1+digits2+carry;

            sb.append(sum%10);
            carry=sum/10;

        

        }
        return sb.reverse().toString();
    }
}
        
    