class Solution {
    public int findPeakElement(int[] nums) {
    int s=0;
    int e=nums.length-1;
    int peak=-1;
    int n=nums.length;
    if(n==1) return 0;
    while(s<=e){
        int mid=s+(e-s)/2;
       if(mid>0 && mid<n-1){
        if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) return mid;
        else if(nums[mid]<nums[mid+1]) s=mid+1;
        else e=mid-1;
       }
       else if(mid==0){
        if(nums[0]>nums[1]) return 0;
        else return 1;
       }
       else{
        if(nums[n-1]>nums[n-2]) return n-1;
        else return n-2;
       }
    } 
    return -1;   
    }
}