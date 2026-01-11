class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";

        String hex = "";
        char[] ch = "0123456789abcdef".toCharArray();

        while (num != 0) {
            int rem = num & 15;   // same as num % 16 but safe for negatives
            hex = ch[rem] + hex;
            num >>>= 4;           // unsigned right shift
        }

        return hex;
    }
}