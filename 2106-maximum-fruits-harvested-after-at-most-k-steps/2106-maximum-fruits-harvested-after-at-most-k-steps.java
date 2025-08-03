public class Solution {

    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int n = fruits.length;
        int[] positions = new int[n];
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            positions[i] = fruits[i][0];
            prefix[i + 1] = prefix[i] + fruits[i][1];
        }

        int maxFruits = 0;

        for (int leftSteps = 0; leftSteps <= k; leftSteps++) {
            int left = startPos - leftSteps;
            int remaining = k - 2 * leftSteps;
            int right = startPos + Math.max(0, remaining);

            int l = lowerBound(positions, left);
            int r = upperBound(positions, right);

            maxFruits = Math.max(maxFruits, prefix[r] - prefix[l]);
        }

        for (int rightSteps = 0; rightSteps <= k; rightSteps++) {
            int right = startPos + rightSteps;
            int remaining = k - 2 * rightSteps;
            int left = startPos - Math.max(0, remaining);

            int l = lowerBound(positions, left);
            int r = upperBound(positions, right);

            maxFruits = Math.max(maxFruits, prefix[r] - prefix[l]);
        }

        return maxFruits;
    }

    private int lowerBound(int[] arr, int value) {
        int lo = 0, hi = arr.length;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] < value) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    private int upperBound(int[] arr, int value) {
        int lo = 0, hi = arr.length;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] <= value) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    public static void main(String[] args) {
        Solution solver = new Solution();

        int[][] fruits = {
            {2, 4},
            {4, 3},
            {6, 1},
            {8, 2}
        };
        int startPos = 5;
        int k = 4;

        int result = solver.maxTotalFruits(fruits, startPos, k);
        System.out.println("Max Fruits: " + result); // Output: 7
    }
}
