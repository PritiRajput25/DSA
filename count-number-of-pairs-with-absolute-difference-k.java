class Solution {
    public int countKDifference(int[] nums, int k) {
     HashMap<Integer,Integer> map=new HashMap<>();
     int count=0;
     for(int ele:nums){
        if(map.containsKey(ele+k)==true){ 
            count+=map.get(ele+k);
        }
        if(map.containsKey(ele-k)==true){
            count+=map.get(ele-k);
        }
        map.put(ele,map.getOrDefault(ele,0)+1); 
     } 
     return count; 
    }
}