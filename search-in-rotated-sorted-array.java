class Solution {
    public int search(int[] nums, int target) {
    int s=0;
    int e=nums.length-1;
    int peak=-1;
    while(s<=e){
        int mid=s+(e-s)/2;
        if(nums[0]<=nums[mid]){
            peak=mid;
            s=mid+1;
        }
        else e=mid-1;
    } 
    s=0;
    e=peak;
    int start=peak+1;
    int end=nums.length-1;
    while(s<=e){
        int mid=s+(e-s)/2;
        if(nums[mid]==target) return mid;
        else if(nums[mid]<target) s=mid+1;
        else e=mid-1;
    } 
    while(start<=end){
        int mid=start+(end-start)/2;
        if(nums[mid]==target) return mid;
        else if(nums[mid]<target) start=mid+1;
        else end=mid-1;
    } 
    return -1; 
    }
}