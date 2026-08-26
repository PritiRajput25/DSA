class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] prefixsum=new int[nums.length];
        int sum=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>(); 
        map.put(0,1);
    for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        prefixsum[i]=sum;
        if(map.containsKey(prefixsum[i]-k)) count+=map.get(prefixsum[i]-k);
       map.put(prefixsum[i],map.getOrDefault(prefixsum[i],0)+1);
    } 
    return count;   
    }
}