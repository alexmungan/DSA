class Solution {
    public void reverse(int[] arr, int start, int end) {
        for(; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        if(k==0)
            return;
  
        //Reverse array
        reverse(nums, 0, n-1);

        //Reverse first k elements
        reverse(nums, 0, k-1);

        //Reverse last n-k elements
        reverse(nums, k, n-1);
    }
}
