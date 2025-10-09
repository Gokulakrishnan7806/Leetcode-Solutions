class Solution {
    public int[][] merge(int[][] intervals) {
       
       Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
       List<int[]> merged = new ArrayList<>();

        int[] current = intervals[0];
        merged.add(current);

         for(int[] interval : intervals){

              int currentend = current[1];
               int newStart = interval[0];
               int newEnd=interval[1];


               if(newStart <= currentend){   //  overlaping intervals

                   current[1] =Math.max(currentend,newEnd);
               }
               else{   // Non overLapping

                   current=interval;
                   merged.add(current);
               }
         }

         return merged.toArray(new int[merged.size()][]);
        
    }
}