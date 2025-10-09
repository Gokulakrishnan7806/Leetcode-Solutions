class Solution {
    public int[][] insert(int[][] intervals, int[] newIntervals) {

        List<int[]> result = new ArrayList<>();

        int  i=0;
        int n=intervals.length;

        while(i < n && intervals[i][1] < newIntervals[0]){
            result.add(intervals[i]);
            i++;
        }

        while( i < n && intervals[i][0] <= newIntervals[1] ) {

            newIntervals[0] = Math. min(intervals[i][0] ,  newIntervals[0]);
            newIntervals[1] = Math.max(intervals[i][1] , newIntervals[1]);
            i++;
        }
        result.add(newIntervals);

        while( i < n){
            result.add(intervals[i]);
            i++;
        }

        return  result.toArray(new int[result.size()][]);
        
    }
}