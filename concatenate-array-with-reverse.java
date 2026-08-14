class Solution {
    public int[] concatWithReverse(int[] nums) {
    //  int[] reverse=new int[nums.length];
    // for(int i=nums.length-1;i>=0;i--){
    //     reverse[n-1-i]=nums[i];
    // }
    int n=nums.length;
    int[] res=new int[2*nums.length];
    for(int i=0;i<n;i++){
        res[i]=nums[i];
        res[n+i]=nums[n-1-i];
    } 
    return res; 
    }
}