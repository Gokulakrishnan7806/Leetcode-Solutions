class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int lsum=0;
        int rsum=0;
        int  max=0;

        for(int i=0;i<k;i++){

            lsum=lsum+cardPoints[i];
            max=lsum;
        }
        int rightIndex=cardPoints.length-1;

        for(int i= k-1;i>=0;i--){

            lsum=lsum-cardPoints[i];
            rsum=rsum+cardPoints[rightIndex];
            rightIndex=rightIndex-1;
            max=Math.max(max,lsum+rsum);
        }
        return max;
    }
        
    
}