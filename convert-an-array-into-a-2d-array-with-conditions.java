class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
     HashMap<Integer,Integer> map=new HashMap<>();
     List<List<Integer>> ans=new ArrayList<>();
     for(int i=0;i<nums.length;i++){
        int row=map.getOrDefault(nums[i],0);
        if(row==ans.size()){
            ans.add(new ArrayList<>());//when first occurance to zeroth row banegi
            /// aur jab repeated occurance mtlb second occurance pe frist row banegi 3rd pr ///second row
        }
        ans.get(row).add(nums[i]);
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
     } 
     return ans;  
    }
}