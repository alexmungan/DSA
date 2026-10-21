class Solution {
    public void rotate(int[] nums, int k) {
	    if((k%n)==0)
            return;

        int n = nums.length;
        int[] rnums = new int[n];

        for(int i = 0; i < n; i++) {
            rnums[(i+k)%n] = nums[i];
        }

        for(int i = 0; i < n; i++) {
            nums[i] = rnums[i];
        }
    }
}
