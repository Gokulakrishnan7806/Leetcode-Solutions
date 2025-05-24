class Solution {
    public int largestRectangleArea(int[] heights) {


        int[] nse=Nge1(heights);
        int[] Pse=pse(heights);
        int maxArea=0;

        for(int i=0;i<heights.length;i++){

            maxArea=Math.max(maxArea,heights[i] * (nse[i] - Pse[i] - 1));

        }
        return maxArea;


    }

    public  int[] Nge1(int[] arr){

       int[] nge=new int[arr.length];

       Stack<Integer> stack=new Stack<>();

        for(int i=arr.length-1;i>=0;i--){

            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {

                stack.pop();
            }

               nge[i]= stack.isEmpty() ? arr.length: stack.peek();
            stack.push(i);

        }
        return nge;
    }

    public  int[] pse(int[] arr){

        int[]  Pse =new int[arr.length];

        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<arr.length;i++){

            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){

                stack.pop();
            }


           Pse[i]=stack.isEmpty() ? -1 :  stack.peek();

            stack.push(i);

        }
        return  Pse;
    }


}