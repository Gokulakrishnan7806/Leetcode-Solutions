class Solution {
    public int romanToInt(String s) {

        Map<Character,Integer> map=new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

         int n=0;

        for(int i=0;i<s.length();i++){

            char ch=s.charAt(i);

            if((i+1 < s.length()) && (map.get(s.charAt(i+1)) > map.get(ch))){


               n+=map.get(s.charAt(i+1)) - map.get(ch);
               i=i+1;
            }
            else{
                   n=n+map.get(ch);
            }

           
        }
        return n;
        
    }
}