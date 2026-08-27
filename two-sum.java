class Solution {
    public int[] twoSum(int[] nums, int target) {
    //  for(int i=0;i<nums.length;i++){
    //     int j=nums.length-1;
    //     while(j>i){
    //         int sum=nums[i]+nums[j];
    //         if(sum==target) return new int[]{i,j};
    //         j--;
    //     }
    //  }  
    //  return new int[]{-1,-1}; 
    int n=nums.length;
    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(nums[i]+nums[j]==target) return new int[]{i,j};
        }
    }
    return new int[]{-1,-1};
    }
}