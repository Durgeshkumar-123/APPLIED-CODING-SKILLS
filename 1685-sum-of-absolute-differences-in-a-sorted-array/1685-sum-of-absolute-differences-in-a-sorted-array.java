class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int total = 0;

        for (int i = 0; i < n; i++) {
            total += nums[i];
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {

            int left = nums[i] * i - leftSum;

            int right = (total - leftSum - nums[i])
                      - nums[i] * (n - i - 1);

            result[i] = left + right;

            leftSum += nums[i];
        }

        return result;
    }
}