class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        int n = nums.length / 3;

        // Count frequencies
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check entries to avoid duplicates
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                ans.add(entry.getKey());
            }
        }

        return ans;
    }
}