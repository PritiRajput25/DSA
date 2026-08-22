class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
     for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        if(map.get(nums[i])<=k) list.add(nums[i]);
     }
     int[] ans=new int[list.size()];
    for(int i=0;i<ans.length;i++){
        ans[i]=list.get(i);
    }
    return ans;  
    }
}