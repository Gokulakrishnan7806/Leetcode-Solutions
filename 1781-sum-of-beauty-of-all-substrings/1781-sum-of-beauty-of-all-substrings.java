class Solution {
    public int beautySum(String str) {

        int totalBeauty=0;
         int n= str.length();

         for(int i=0;i<n;i++){

             Map<Character,Integer> map = new HashMap<>();

             for(int j =i ;j<n ;j++){

                  char  ch = str.charAt(j);

                  map.put(ch,map.getOrDefault(ch,0)+1);

                  int MaxFreq = Integer.MIN_VALUE;
                  int minfreq =Integer.MAX_VALUE;

                  for(int  count : map.values()){

                      minfreq = Math.min(minfreq,count);
                      MaxFreq =Math.max(MaxFreq,count);
                  }

                  totalBeauty = totalBeauty+(MaxFreq-minfreq);
             }
         }
         return  totalBeauty;
        
    }
}