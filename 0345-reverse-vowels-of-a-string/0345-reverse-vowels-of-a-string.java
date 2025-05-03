class Solution {

    public static String  reverseVowels(String s)
    {

        char[] ch = s.toCharArray();

        int start = 0;
        int end = ch.length- 1;

        while (start < end)
        {

            if (!isVowels((ch[start]))){

                start++;
            } else if (!isVowels((ch[end]))) {
                end--;
            } else {

                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;

                start++;
                end--;
            }
        }
      return new String(ch);
    }


    public static boolean isVowels(char s)
    {
        
      if (s== 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u' || s== 'A' || s == 'E' || s == 'I' || s== 'O' || s == 'U'){

              return true;
            }
            return false;
    }

}

     



      

    
   
