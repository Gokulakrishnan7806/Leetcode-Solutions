class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {

        int n = arr.length;

        Set<List<Integer>>  set = new HashSet<>();

        for(int i=0;i<n;i++){


            for(int j=i+1;j<n;j++){

                Set<Long> seen = new HashSet<>();

                for(int k=j+1 ; k<n;k++){

                    long sum =(long) arr[i]+arr[j];
                    sum=sum+arr[k];

                    long fourthNum = (long)target-sum;

                    if(seen.contains(fourthNum)){

                        List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k], (int)fourthNum);
                        Collections.sort(triplet);
                        set.add(triplet);
                    }

                    seen.add( (long)arr[k]);
                }


            }


        }

        return new ArrayList<>(set);
    }
}
        
