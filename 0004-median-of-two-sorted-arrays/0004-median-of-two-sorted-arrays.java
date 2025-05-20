class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

       int[] mergedarr=new int[nums1.length+nums2.length];

       System.arraycopy(nums1,0,mergedarr,0,nums1.length);
       System.arraycopy(nums2,0,mergedarr,nums1.length,nums2.length); 

       Arrays.sort(mergedarr);


       int n=mergedarr.length;

       if(n%2==0){

        return (mergedarr[n/2-1]+mergedarr[n/2])/2.0;
       }

       else{
        return mergedarr[n/2];
       }
    }
}


    
   