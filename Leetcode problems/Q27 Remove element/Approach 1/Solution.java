
class Solution {

    public int removeElement(int[] nums, int val) {
        int len = nums.length - 1;
        int x = 0;
        int y = 0;
        int counter = 0;

        for (int i = len; i >= 0; i--) {
            x = i; // We need the index of pointer x
            y = i - 1; // One less index is the y variable
            

            for (int j = y; j >= 0; j--) {
                if (nums[j] == val) {
                    int temp = nums[x];
                    nums[x] = nums[j];
                    nums[j] = temp;
                    counter++;
                }
            }
        }

        return counter; 
    }

    public static void main(String args[]) {
        int nums[] = {3, 2, 2, 3};
        int val = 3;

        new Solution().removeElement(nums, val);

        for (int elem : nums) {
            System.out.print(elem + "--");
        }
    }
}
