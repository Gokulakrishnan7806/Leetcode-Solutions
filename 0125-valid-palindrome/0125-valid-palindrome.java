class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.trim().isEmpty()) return true;

        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        
        int left = 0, right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
