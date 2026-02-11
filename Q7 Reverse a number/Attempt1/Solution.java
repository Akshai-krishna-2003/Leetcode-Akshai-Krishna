class Solution {
    public int reverse(int x) {
        int reverse = 0;
        int xDupli = x;

        if (x < 0) {
            xDupli *= -1;
            while (xDupli > 0) {
                if (reverse > Integer.MAX_VALUE / 10 ||
                        reverse < Integer.MIN_VALUE / 10) {
                    return 0;
                }
                int last = xDupli % 10; // Get remainder
                reverse = (reverse * 10) + last;
                xDupli = xDupli / 10;
            }
            return reverse * -1;
        }

        while (xDupli > 0) {
            if (reverse > Integer.MAX_VALUE / 10 ||
                    reverse < Integer.MIN_VALUE / 10) {
                return 0;
            }
            int last = xDupli % 10; // Get remainder
            reverse = (reverse * 10) + last;
            xDupli = xDupli / 10;
        }

        return reverse;
    }

    public static void main(String args[]) {
        Solution sol = new Solution();

        System.out.println("Reversed value is: " + sol.reverse(563847412));
    }
}