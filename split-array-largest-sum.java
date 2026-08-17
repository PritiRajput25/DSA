class Solution {
    public int splitArray(int[] nums, int k) {
     int s=0;
     int e=0;
     for(int n:nums){
        s=Math.max(s,n);
        e+=n;
     }
     int ans=-1;
     while(s<=e){
        int mid=s+(e-s)/2;
        int split=1;
        int sum=mid;
        for(int i=0;i<nums.length;i++){
            if(sum>=nums[i]){
                sum-=nums[i];
            }
            else{
                sum=mid;
                sum-=nums[i];
                split++;
            }
        }
         if(split<=k){
            ans=mid;
            e=mid-1;
            
         }
         else s=mid+1;
     } 
     return ans;  
    }
}