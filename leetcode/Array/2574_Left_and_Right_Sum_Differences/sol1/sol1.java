class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] differenceArr = new int[n];
        
        for(int i = 0; i < n; i++) {
            int leftSum = 0;
            for(int left = 0; left < i; left++) {
                leftSum += nums[left];
            }
            
            int rightSum = 0;
            for(int right = i+1; right < n; right++) {
                rightSum += nums[right]; 
            }
            
            differenceArr[i] = Math.abs(leftSum - rightSum);
        }

        return differenceArr;
    }
}
