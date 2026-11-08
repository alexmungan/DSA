class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] differenceArr = new int[n];
        
        int total = 0;
        for(int i = 0; i < n; i++) 
            total += nums[i];
        
        int leftSum = 0;
        int rightSum = total;
        for(int i = 0; i<n; i++) {
            rightSum -= nums[i];
            differenceArr[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }

        return differenceArr;
    }
}
