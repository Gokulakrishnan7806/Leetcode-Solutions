class Solution {
    public int trap(int[] height) {
        int total=0;

         int[] leftMax = Leftprefixmax(height);
        int[] rightMax = rightPostMax(height);

        for(int i=0;i<height.length;i++){

            if(height[i] < leftMax[i]&& height[i] < rightMax[i]){

                

                total=total+ Math.min( leftMax[i],rightMax[i])-height[i];
            }
        }
        return total;

      
    }
     public static int[] rightPostMax(int[] arr)
     {

        int[] postfix=new int[arr.length];

        int max=arr[arr.length-1];
        postfix[arr.length-1]=max;

        for(int i= arr.length-2;i>=0;i--){

            max=Math.max(max,arr[i]);
            postfix[i]=max;
        }
        return postfix;
     }

     public static  int[] Leftprefixmax(int[] arr){

        int[] prefix=new int[arr.length];
          int max=arr[0];
          prefix[0]=max;

        for(int i=1;i<arr.length;i++){

            max=Math.max(max,arr[i]);
            prefix[i]=max;


        }
        return  prefix;
    }

        
    
}