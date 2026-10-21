public class Solution {

  public void rotate(int[] nums, int k) {
    int n = nums.length;
    if((k%n) == 0) 
	    return;

    for(int startingPoint = 0, count = 0; count < n; startingPoint++) {
      int temp1 = nums[startingPoint];
      for(int i = (startingPoint + k) % n; i != startingPoint; i = (i+k) % n, count++) {
        int temp2 = nums[i];
        nums[i] = temp1;
        temp1 = temp2;
      }
      nums[startingPoint] = temp1;
      count++;
    }

  }
}
