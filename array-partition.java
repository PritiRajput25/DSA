class Solution {
    public int arrayPairSum(int[] nums) {
    int n=nums.length/2;
    Arrays.sort(nums);
    int i=0;
    int sum=0;
    while(i<2*n){
        sum+=Math.min(nums[i],nums[i+1]);
        i+=2;
    }
    return sum;    
    }
}