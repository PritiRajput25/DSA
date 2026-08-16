class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    HashMap<Integer,Integer> map=new HashMap<>();
      int k=0;
      int[] res=new int[Math.min(nums1.length,nums2.length)];
     for(int i=0;i<nums2.length;i++){
        map.put(nums2[i],map.getOrDefault(nums2[i],0)-1);
    }  
    for(int i=0;i<nums1.length;i++){
        if(map.getOrDefault(nums1[i],0)!=0){
         res[k]=nums1[i];
         k++;
         map.put(nums1[i],0);
        }
    }
    int[] ans=new int[k];
    for(int i=0;i<k;i++){
        ans[i]=res[i];
    }
    return ans;
    }
}