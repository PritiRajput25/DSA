class Solution {
    int reverse(int num){
        int digit=0;
        while(num!=0){
            digit=digit*10+num%10;
            num/=10;
        }
        return digit;
    }
    public int countDistinctIntegers(int[] nums) {
       int[] res=new int[2*nums.length];
       for(int i=0;i<res.length;i++){
        if(i<nums.length) res[i]=nums[i];
        else{
            res[i]=reverse(nums[i-nums.length]);
        }
       } 
       Arrays.sort(res);
       int count=1;
       for(int i=1;i<res.length;i++){
        if(res[i]!=res[i-1]) count++;
       }
       return count;
    }
}