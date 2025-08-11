class Solution {
    public int maxRepeating(String sequence, String word) {


        String temp = word;
        int count=0;

        while(sequence.contains(temp)){

            count++;
            temp=temp+word;
        }
        return count;
    }
}