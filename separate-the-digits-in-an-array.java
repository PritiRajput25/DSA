class Solution {
    public int[] separateDigits(int[] nums) {
    int length=0;
    for(int i=0;i<nums.length;i++){
        int temp=nums[i];
        while(temp!=0){
            length++;
            temp/=10;
        }
    }
    int[] ans=new int[length];
    int ind=length-1;
    for(int i=nums.length-1;i>=0;i--){
        int temp=nums[i];
        while(temp!=0){
    ans[ind]=temp%10;
    ind--;
    temp/=10;
        }
    } 
    return ans;  
    }

}