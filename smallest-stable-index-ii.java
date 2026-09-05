class Solution {
    public int firstStableIndex(int[] nums, int k) {
    
    int[] minn=new int[nums.length];
    int n=nums.length;
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    for(int i=n-1;i>=0;i--){
        if(nums[i]<=min){
            min=nums[i];
        }
        minn[i]=min;
    } 
    for(int i=0;i<n;i++){
        if(nums[i]>max)max=nums[i];
        if(max-minn[i]<=k) return i;
    } 
    return -1; 
    }
}