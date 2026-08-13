class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    HashMap<Integer,Integer> map=new HashMap<>();
    List<Integer> ans=new ArrayList<>();
    for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
    } 
    for(int i=0;i<nums.length;i++){
     if(map.getOrDefault(nums[i],0)==2) {
        ans.add(nums[i]);
        map.remove(nums[i]);
     }
    } 
    return ans;  
    }
}