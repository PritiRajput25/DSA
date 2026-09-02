class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
    HashMap<Integer,Integer> map1=new HashMap<>();
    HashMap<Integer,Integer> map2=new HashMap<>();
    int l=0;
    int r=0;
    int n=nums.length;
    int m=0;
    while(r<n){
        map1.put(nums[r],map1.getOrDefault(nums[r],0)+1);
        while(l<=r && map1.size()>k){
        if(map1.get(nums[l])==1) map1.remove(nums[l]);
        else map1.put(nums[l],map1.getOrDefault(nums[l],0)-1);
        l++;
        }
        if(map1.size()<=k) m+=(r-l+1);
        r++;
    }  
    l=0;
    r=0;
    int p=0;
    while(r<n){
        map2.put(nums[r],map2.getOrDefault(nums[r],0)+1);
        while(l<=r && map2.size()>k-1){
        if(map2.get(nums[l])==1) map2.remove(nums[l]);
        else map2.put(nums[l],map2.getOrDefault(nums[l],0)-1);
        l++;
        }
        if(map2.size()<=k-1) p+=(r-l+1);
        r++;
    } 
    return m-p; 
    }
}