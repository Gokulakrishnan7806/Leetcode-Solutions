class Solution {
    public List<List<Integer>> threeSum(int[] arr) {

        int n = arr.length;

        Set<List<Integer>>  set = new HashSet<>();

        for(int i=0;i<n-2;i++){

            Set<Integer> seen = new HashSet<>();

            for(int j=i+1;j<n;j++){

                int thirdNum = -(arr[i]+arr[j]);

                if(seen.contains(thirdNum)){

                    List<Integer> triplet = Arrays.asList(arr[i],arr[j],thirdNum);
                    Collections.sort(triplet);
                    set.add(triplet);
                }

                seen.add(arr[j]);
            }


        }

        return new ArrayList<>(set);
        
    }
}