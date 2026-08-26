class Solution {
    public double minimumAverage(int[] nums) {
     Arrays.sort(nums);
     int left=0;
     int right=nums.length-1;
     double[] avg=new double[nums.length/2];
    while(left<right){
     avg[left]=(double)((nums[left]+nums[right])/(double)2);
     left++;
     right--;
    }
    Arrays.sort(avg);
    return avg[0];
    }
}