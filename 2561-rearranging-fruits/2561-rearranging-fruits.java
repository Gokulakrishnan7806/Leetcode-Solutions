

class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        Map<Integer, Integer> freq = new HashMap<>();
        int n = basket1.length;

        // Step 1: Count frequency of all fruits
        for (int fruit : basket1)
            freq.put(fruit, freq.getOrDefault(fruit, 0) + 1);
        for (int fruit : basket2)
            freq.put(fruit, freq.getOrDefault(fruit, 0) + 1);

        // Step 2: If any fruit has odd count → return -1
        for (int count : freq.values()) {
            if (count % 2 != 0)
                return -1;
        }

        // Step 3: Count how many extra fruits in basket1 and basket2
        Map<Integer, Integer> count1 = new HashMap<>();
        Map<Integer, Integer> count2 = new HashMap<>();
        for (int fruit : basket1)
            count1.put(fruit, count1.getOrDefault(fruit, 0) + 1);
        for (int fruit : basket2)
            count2.put(fruit, count2.getOrDefault(fruit, 0) + 1);

        List<Integer> extra1 = new ArrayList<>();
        List<Integer> extra2 = new ArrayList<>();

        for (int fruit : freq.keySet()) {
            int total = freq.get(fruit);
            int need = total / 2;
            int c1 = count1.getOrDefault(fruit, 0);
            int c2 = count2.getOrDefault(fruit, 0);

            if (c1 > need) {
                for (int i = 0; i < c1 - need; i++) {
                    extra1.add(fruit);
                }
            } else if (c2 > need) {
                for (int i = 0; i < c2 - need; i++) {
                    extra2.add(fruit);
                }
            }
        }

        // Step 4: Sort extra lists
        Collections.sort(extra1); // ascending
        Collections.sort(extra2, Collections.reverseOrder()); // descending

        // Step 5: Find the minimum fruit value
        int minFruit = Integer.MAX_VALUE;
        for (int fruit : freq.keySet()) {
            minFruit = Math.min(minFruit, fruit);
        }

        // Step 6: Calculate the total minimum cost
        long cost = 0;
        for (int i = 0; i < extra1.size(); i++) {
            int a = extra1.get(i);
            int b = extra2.get(i);
            cost += Math.min(Math.min(a, b), minFruit * 2);
        }

        return cost;
    }
}

        
