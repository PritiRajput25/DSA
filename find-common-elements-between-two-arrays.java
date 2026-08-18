class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
     HashMap<Integer,Integer> map1=new HashMap<>();
      HashMap<Integer,Integer> map2=new HashMap<>();
     int answer1=0;
     for(int i=0;i<nums2.length;i++){
        map1.put(nums2[i],map1.getOrDefault(nums2[i],0)+1);
     } 
     for(int i=0;i<nums1.length;i++){
        if(map1.getOrDefault(nums1[i],0)!=0){
            answer1++;
        }
        map2.put(nums1[i],map2.getOrDefault(nums1[i],0)+1);
     } 
     int answer2=0;
     for(int i=0;i<nums2.length;i++){
        if(map2.getOrDefault(nums2[i],0)!=0){
            answer2++;
        } 
     }
     return new int[]{answer1,answer2};
    }
}