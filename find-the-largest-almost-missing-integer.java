class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>(); 
        ArrayList<Integer> ans=new ArrayList<>();
        int max=-1;
     for(int i=0;i<nums.length;i++){
        for(int j=i;j<nums.length;j++){
            if((j-i+1)==k){
                HashSet<Integer> set=new HashSet<>();
          for(int l=i;l<=j;l++){
            set.add(nums[l]);
          }
          for(int l=i;l<=j;l++){
            if(set.contains(nums[l])){
                map.put(nums[l],map.getOrDefault(nums[l],0)+1);
                set.remove(nums[l]);
            }
          }
            }
        }
     } 
     for(int i=0;i<nums.length;i++){
        if(map.getOrDefault(nums[i],0)==1){
            ans.add(nums[i]);
            map.put(nums[i],map.getOrDefault(nums[i],0)-1);
        }
     }  
     for(int i=0;i<ans.size();i++){
        if(ans.get(i)>max) max=ans.get(i);
     }
     return max;
    }
}